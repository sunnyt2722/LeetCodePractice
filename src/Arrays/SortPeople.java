package Arrays;

public class SortPeople {
	public static void main(String[] args) {
		String name[]= {"Alice","Bob","Bob"};
		int height[]= {155,185,150};
		String names[] = sortPeople(name, height);
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]);

	}
	public static String[] sortPeople(String[] names, int[] heights) {
		for(int i=0;i<heights.length;i++) {
			for(int j=i;j<heights.length;j++) {
				if(heights[i]>heights[j]) {
					int temp=heights[i];
					String tempNameString=names[i];
					heights[i] = heights[j];
					names[i] = names[j];
					heights[j]=temp;
					names[j]=tempNameString;
				}
			}
		}
        return names;
    }
}
