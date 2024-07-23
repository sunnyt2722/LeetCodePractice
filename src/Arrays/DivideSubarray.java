package Arrays;

public class DivideSubarray {

	public static void main(String[] args) {
		int[] arr = {10,15,20,5,5};
		int sum = 25;
		System.out.println("---"+subsetCount(arr, sum,0));
	}
	
	public static int subsetCount(int[] arr, int sum, int i) {
		if(sum==0)
			return 1;
		if(sum<0)
			return 0;
		if(i==arr.length)
			return 0;
		return subsetCount(arr, sum-arr[i], i+1) + subsetCount(arr, sum, i+1);
		
	}
}
