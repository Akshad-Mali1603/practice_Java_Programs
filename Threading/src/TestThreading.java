
public class TestThreading {

	public static void main(String[] args) {
		
		Thread th= new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("Hello World !!");
				
			}
		});
		
		th.start();
		
		try {
			th.join();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
