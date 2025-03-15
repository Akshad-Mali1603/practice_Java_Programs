
public class Addition implements Runnable{

	@Override
	public void run() {
		
		int sum=0;
			try {
				if (Thread.currentThread().getPriority()!=Thread.MAX_PRIORITY) {
				Thread.sleep(100);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for (int i = 1; i <= 100; i++) {
				sum+=i;
			}
			System.out.println(Thread.currentThread().getName()+" : "+sum);
	}
	
	
}
