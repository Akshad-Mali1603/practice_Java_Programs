import java.util.Iterator;

public class TestPriorityThread {

	public static void main(String[] args) {
		
		Thread t[]= new Thread[10];
		Addition addition= new Addition();
		
		for (int i = 0; i < t.length; i++) {
			t[i]=new Thread(addition);
			t[i].setPriority(Thread.MIN_PRIORITY);
			
		}
		t[6].setPriority(Thread.MAX_PRIORITY);
		t[2].setPriority(Thread.MAX_PRIORITY);
		
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
		}
		
		for (int i = 0; i < t.length; i++) {
			try {
				t[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
