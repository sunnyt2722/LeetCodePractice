package CollectionsPractice.ListPractice;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		Integer arr[]= {46,72,85,12,49,54};
		List<Integer> arrayListFromArray=Arrays.asList(arr);
		for(int i=0;i<arrayListFromArray.size();i++)
			System.out.println(arrayListFromArray.get(i));
		System.out.println(arrayListFromArray);
	}
}
