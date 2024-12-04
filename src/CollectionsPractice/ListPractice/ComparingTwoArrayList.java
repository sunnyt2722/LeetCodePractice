package CollectionsPractice.ListPractice;

import java.util.ArrayList;
import java.util.List;

public class ComparingTwoArrayList {

	public static void main(String[] args) {
		List<String> listOne=new ArrayList<String>();
		List<String> listTwo=new ArrayList<String>();
		listOne.add("This");
		listOne.add(" is");
		listOne.add(" my");
		listOne.add(" List");
		listTwo.add("This");
		listTwo.add(" is");
		listTwo.add(" my");
		listTwo.add(" List");
		if(listOne.equals(listTwo)) {
			System.out.println("Lists are same");
		}
		else {
			System.out.println("Lists are not same");
		}
		listTwo.add(" two");
		if(listOne.equals(listTwo)) {
			System.out.println("Lists are same");
		}
		else {
			System.out.println("Lists are not same");
		}
	}
}
