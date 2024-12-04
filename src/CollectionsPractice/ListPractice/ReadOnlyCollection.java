package CollectionsPractice.ListPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnlyCollection {

	public static void main(String[] args) {
		List<String> listItem=new ArrayList<>();
		listItem.add("Test");
		listItem.add("Read");
		listItem.add("Only");
		System.err.println("--------------------");
		listItem.forEach(s->System.out.println(s));
		System.err.println("--------------------");
		listItem.remove(1);
		listItem.forEach(s->System.out.println(s));
		listItem.add("Read");
		System.err.println("--------------------");
		listItem.forEach(s->System.out.println(s));
		System.err.println("--------------------");
		listItem = Collections.unmodifiableList(listItem);
		try {
			listItem.remove(1);
		}
		catch (Exception e) {
			System.out.println("List is not readonly "+e);
		}
	}
}
