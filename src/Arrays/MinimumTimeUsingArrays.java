package Arrays;


public class MinimumTimeUsingArrays {
//	2809. Minimum Time to Make Array Sum At Most x
	public static void main(String[] args) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		System.out.println("-------- "+minimumTime(arr1,arr2, 4));
	}

	public static int minimumTime(int[] num1, int[] num2, int x) {
        for(int i=0;i<num1.length;i++){
            boolean flag=false;
            int sum=0;
            for(int j=0;j<num1.length;j++){
                num1[j]=num1[j]+num2[j];
                num1[i]=0;
                sum=sumArray(num1);
                if(sum==x){
                    flag=true;
                    break;
                }
            }
            if(flag)
                return i+1;
        }
		return -1;
    }
	
	public static int sumArray(int[] array) {
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum=sum+array[i];
		return sum;
	}
}
