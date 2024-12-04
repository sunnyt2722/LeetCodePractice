package CollectionsPractice.MapsPractice;

import java.util.HashMap;
import java.util.Map;


public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<String, Integer> myMap=new HashMap<>();
		myMap.put("Kohli", 82);
		myMap.put("Inzi", 40);
		myMap.put("Shahid", 23);
		myMap.put("Sachin", 100);
		for(Map.Entry<String, Integer> mapEntry:myMap.entrySet()) {
			if(mapEntry.getValue()>50)	
				System.out.println(mapEntry.getKey());
		}
	}
}
