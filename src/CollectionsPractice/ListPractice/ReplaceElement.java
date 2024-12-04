package CollectionsPractice.ListPractice;

import java.util.ArrayList;
import java.util.List;

public class ReplaceElement {

	public static void main(String[] args) {
		List<String> listToReplace=new ArrayList<String>();
		listToReplace.add("This");
		listToReplace.add(" string");
		listToReplace.add(" element");
		listToReplace.add(" needs");
		listToReplace.add(" to be");
		listToReplace.add(" replace");
		listToReplace.forEach(s->System.out.print(s));
		listToReplace.set(5, " replaced");
		System.out.println();
		listToReplace.forEach(s->System.out.print(s));
	}
}
