import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ThreadingArrayListTest {

	public static void main(String[] args) {
		
		Collection<Integer>  arr= Collections.synchronizedCollection(new ArrayList<Integer>());
		
		Runnable task=new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1; i <= 100; i++) {
					arr.add(i);
				}
			}
		};
		
		Thread t1= new Thread(task);
		Thread t2= new Thread(task);
		
		t1.start();
		t2.start();
		
		try {
			t2.join();
			t1.join();
			System.out.println("Array List Size: "+arr.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
