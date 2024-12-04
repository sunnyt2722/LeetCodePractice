package CollectionsPractice.ListPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListToSetConversion {
	public static void main(String[] args) {
		List<String> listOne=new ArrayList<String>();
		listOne.add("This");
		listOne.add(" is");
		listOne.add(" my");
		listOne.add(" List");
		for(String s:listOne)
			System.out.println(s);
		Set<String> setOne=new HashSet<String>();
		for(String s:listOne)
			setOne.add(s);
		System.out.println(setOne);
		Set<String> setTwo = new HashSet<String>(listOne);
		System.out.println(setTwo);
		Set<String> setThree= new TreeSet<String>(listOne);
		System.out.println(setThree);
	}
}
