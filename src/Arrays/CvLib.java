package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CvLib {

	public static void main(String[] args) {
		findDuplicates("TestDuplicates");
	}
	
	public static Map<Character, Integer> findDuplicates(String str){
		
		Map<Character, Integer> count = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(count.containsKey(str.charAt(i)))
				count.put(str.charAt(i),count.get(str.charAt(i))+1);
			else {
				count.put(str.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> mapElement:count.entrySet()) {
			if(mapElement.getValue()>1) {
				System.out.println(mapElement.getKey()+" has number of occurences "+mapElement.getValue());
			}
		}
		return count;
	}
}
