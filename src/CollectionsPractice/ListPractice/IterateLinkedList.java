package CollectionsPractice.ListPractice;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("This");
		linkedList.add(" is");
		linkedList.add(" an");
		linkedList.add(" linked list");
		Iterator itrIterator=linkedList.iterator();
		while (itrIterator.hasNext()) {
			System.out.print(itrIterator.next());
		}
	}
}
