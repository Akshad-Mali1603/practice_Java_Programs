
public class Testthreadig1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t[]= new Thread[100];
		Thread task= new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println("Hello Akshad !!"+Thread.currentThread().getName()+"P :"+Thread.currentThread().getName());
				
			}
		});
		
		for (int i = 0; i < t.length; i++) {
			t[i]= new Thread(task,"T"+i);
			
		}
		
		for (int i = 0; i < t.length; i++) {
			t[i].start();
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
