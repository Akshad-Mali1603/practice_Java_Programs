package area;
import java.util.Arrays;
import java.util.Collections;

public class DescendingSort {
    public static void main(String[] args) {
        int[] a = {2,0,2,1,1,0};
        
        // Convert to Integer array
        Integer[] integerArray = Arrays.stream(a).boxed().toArray(Integer[]::new);
        
        // Sort in descending order
        Arrays.sort(integerArray, Collections.reverseOrder());
        
        // Convert back to int array
        a = Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
        
        // Print sorted array
        System.out.println(Arrays.toString(a));
    }
}
