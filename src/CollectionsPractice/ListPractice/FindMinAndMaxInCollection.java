package CollectionsPractice.ListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMinAndMaxInCollection {

	public static void main(String[] args) {
		List<Integer> listItemIntegers = new ArrayList<Integer>();
		listItemIntegers.add(54);
		listItemIntegers.add(64);
		listItemIntegers.add(32);
		listItemIntegers.add(71);
		listItemIntegers.add(84);
		listItemIntegers.add(19);
		System.out.println("Max is "+Collections.max(listItemIntegers));
		System.out.println("Min is "+Collections.min(listItemIntegers));
	}
}
