import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> mapcar= new HashMap<String, Integer>();
		
		mapcar.put("Mruti", 800000);
		mapcar.put("Tata", 100000);
		mapcar.put("Toyota", 1800000);
		mapcar.put("BMW", 8000000);
		mapcar.put("Maruti", 1400000);
		
		
//		System.out.println("Map Car: "+mapcar);
//		
//		Integer key= mapcar.get("BMW");
//		System.out.println("for the key value is : "+key);
//		
//		Set<String> keyset=mapcar.keySet();
//		System.out.println(keyset);
//		
//		for (String s : keyset) {
//			System.out.println(s+" value is :"+mapcar.get(s));
//			
//		}
//		
		
//		Map<String, Integer> mapcar2= new TreeMap<String, Integer>();
//		
//		mapcar2.put("Mruti", 800000);
//		mapcar2.put("Tata", 100000);
//		mapcar2.put("Toyota", 1800000);
//		mapcar2.put("BMW", 8000000);
//		mapcar2.put("Maruti", 1400000);
//		
//		System.out.println("Map Car2 :"+mapcar2);
//		
		
//		//Practice HashMap Under HashMap
//		
		Map<String,Map<String, Integer>> cars=new HashMap<String, Map<String,Integer>>();
		
		cars.put("normalcar", mapcar);
		Set<String> keyset=cars.keySet();//set of HashMap Key by product choice
		System.out.println(keyset+"\n");
		
		Set<String> key=mapcar.keySet();//nested HashMap set of key 
		System.out.println(key+"\n");
		
		for (String s : keyset) {
			for (String k : key) {
				
				System.out.println(" Car name: "+k+" car value: "+mapcar.get(k));
			}
		}
		
		
		
		
		
	}

}
