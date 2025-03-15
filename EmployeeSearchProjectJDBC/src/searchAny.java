import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class searchAny {
    private static Connection con = null;
    private static String input = "";
    private static List<String> suggestions = new ArrayList<>();

    public searchAny() {
        try {
            con = JDBCConnnection.connection();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.submit(() -> showSuggestions());

            // Capture real-time input
            readInputLive();

            // Shutdown executor after user input
            executor.shutdown();
            con.close();
        } catch (ClassNotFoundException | SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void readInputLive() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Start typing to search (type 'exit' to stop):");

        while (true) {
            if (reader.ready()) {
                int charCode = reader.read();
                if (charCode == -1) break; // End of input
                char typedChar = (char) charCode;

                if (typedChar == '\n') continue;
                if (typedChar == '\b' && !input.isEmpty()) {
                    input = input.substring(0, input.length() - 1);
                } else if (Character.isLetterOrDigit(typedChar) || typedChar == ' ') {
                    input += typedChar;
                }

                if (input.equalsIgnoreCase("exit")) break;

                // Check if input is a number (selection)
                if (input.matches("\\d+")) {
                    int selectedIndex = Integer.parseInt(input);
                    if (selectedIndex > 0 && selectedIndex <= suggestions.size()) {
                        fetchAndDisplayRecord(suggestions.get(selectedIndex - 1));
                    } else {
                        System.out.println("\nInvalid selection.");
                    }
                    input = ""; // Reset input after selection
                }
            }
        }
    }

    private static void showSuggestions() {
        while (true) {
            if (!input.isEmpty() && !input.matches("\\d+")) {
                fetchSuggestionsFromDatabase(input);
            }

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    private static void fetchSuggestionsFromDatabase(String query) {
        String sql = "SELECT name FROM project WHERE name LIKE ? LIMIT 5";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, query + "%");
            ResultSet rs = pstmt.executeQuery();

            suggestions.clear(); // Clear old suggestions
            int index = 1;
            boolean found = false;

            // Clear the line before printing suggestions
            System.out.print("\r" + " ".repeat(50) + "\r");

            System.out.print("Suggestions: ");
            while (rs.next()) {
                String name = rs.getString("name");
                suggestions.add(name);
                System.out.print(index + ") " + name + "  ");
                index++;
                found = true;
            }

            if (!found) System.out.print("No matches found.");
            System.out.flush();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void fetchAndDisplayRecord(String selectedName) {
        String sql = "SELECT * FROM project WHERE name = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, selectedName);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                System.out.println("\n=== Project Details ===");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Technology: " + rs.getString("technology"));
                System.out.println("=======================\n");
            } else {
                System.out.println("\nNo details found for " + selectedName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
