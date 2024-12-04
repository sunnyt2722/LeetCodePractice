package CollectionsPractice.ListPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrintList {

	public static void main(String[] args) {
		List<String> listItem=new ArrayList<>();
		listItem.add("Test");
		listItem.add("Automation");
		listItem.add("UBS");
		
		for(int i=0;i<listItem.size();i++){
			System.out.println(listItem.get(i));
		}
		
		listItem.forEach(n->System.out.println(n));
		
		Iterator<String> itrIterator = listItem.iterator();
		while (itrIterator.hasNext()) {
			System.out.println(itrIterator.next());
		}
		
	}
}
