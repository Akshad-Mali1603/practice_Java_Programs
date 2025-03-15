package assignment3;

public class Ointment extends Medicine {
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("In case of ointments it could be for external use only\n");
	}
}
