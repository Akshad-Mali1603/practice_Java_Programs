import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {
		
		//Lisnklist
		List<Integer> lst=new LinkedList<Integer>();
		lst.add(new Integer(10));
		lst.add(20);
		lst.add(30);
		lst.add(50);
		System.out.println("linklist is: "+lst);
		
		System.out.println(lst.get(3));
		System.out.println(lst.contains(20));
		System.out.println(lst.indexOf(50));
		lst.remove(2);
		System.out.println("List is: "+lst);
		
		List<Integer> lst3= new LinkedList<Integer>();
		for (int i = lst.size()-1; i >=0; i--) {
			lst3.add(lst.get(i));
		}
		System.out.println("List3 is: "+lst3);
//		int l4= lst3.indexOf(lst3.getLast());
//		System.out.println("last element is: "+l4);
		
		
		System.out.println("List3 is:"+lst3);
		
		//Arraylist
		List<Integer> lst1=new ArrayList<Integer>();
		lst1.add(new Integer(10));
		lst1.add(20);
		lst1.add(30);
		lst1.add(50);
		System.out.println("linklist is: "+lst1);
		
		System.out.println(lst1.get(3));
		System.out.println(lst1.contains(20));
		System.out.println(lst1.indexOf(50));
		lst1.remove(2);
		System.out.println("List is: "+lst1);
		
		

	}

	private static List<Integer> add(int indexOf) {
		// TODO Auto-generated method stub
		return null;
	}

}

