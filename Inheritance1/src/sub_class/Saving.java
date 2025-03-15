package sub_class;

import super_class.Account;

public class Saving extends Account {
		public static final int length = 0;
		private float savingROI;

		public Saving() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Saving(int accNo, String accOnwerName, float accBalance, float savingROI) {
			super(accNo, accOnwerName, accBalance);
			this.savingROI = savingROI;
		}

		public float getSavingROI() {
			return savingROI;
		}

		public void setSavingROI(float savingROI) {
			this.savingROI = savingROI;
		}

		@Override
		public String toString() {
			return "Saving [savingROI=" + savingROI + ", toString()=" + super.toString() + "]";
		}
		
		
}
