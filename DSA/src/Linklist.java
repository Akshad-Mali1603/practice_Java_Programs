
public class Linklist {

	public static void main(String[] args) {
		

	Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			if(Thread.currentThread().getPriority()!=Thread.MAX_PRIORITY) {
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
				}
			}
			System.out.println("Hello world"+Thread.currentThread().getName());
			
		}
	});
	
	Thread all[]=new Thread[20];
	for (int i = 1; i < all.length; i++) {
		all[i]=new Thread(t1);
	}
	all[3].setPriority(Thread.MAX_PRIORITY);
	for (int i = 1; i  < all.length; i++) {
		all[i].start();
	}

}}
