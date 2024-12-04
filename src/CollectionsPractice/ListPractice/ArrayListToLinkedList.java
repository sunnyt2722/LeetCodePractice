package CollectionsPractice.ListPractice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("One");
		arrayList.add("Two");
		arrayList.add("Three");
		arrayList.add("Four");
		LinkedList<String> linkedList=new LinkedList<String>();
		for(String s:arrayList) {
			linkedList.add(s);
		}
		System.out.println(arrayList);
		System.out.println(linkedList);
	}
}
