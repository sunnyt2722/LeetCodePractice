package CollectionsPractice.MapsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CheckKeyInHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> myMap = new HashMap<>();
		myMap.put(101, "Math");
		myMap.put(102, "English");
		myMap.put(103, "Science");
		myMap.put(104, "Computer");
		System.err.println("-----------------");
		for(Map.Entry<Integer, String> mpEntry:myMap.entrySet()) {
			System.out.println(mpEntry.getKey());
			System.out.println(mpEntry.getValue());
		}
		System.err.println("-----------------");

		System.err.println("-----------------");
		Iterator<Map.Entry<Integer, String>> myIterator = myMap.entrySet().iterator();
		while(myIterator.hasNext()) {
			Map.Entry<Integer, String> mapEntry = myIterator.next();
			System.out.println(mapEntry.getKey());
			System.out.println(mapEntry.getValue());
		}
		System.err.println("-----------------");
	}

}
