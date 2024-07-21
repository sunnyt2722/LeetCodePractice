package Arrays;

import java.util.Arrays;
import java.util.List;

public class MinimumTime {
//	2809. Minimum Time to Make Array Sum At Most x
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5,3);
		List<Integer> list2 = Arrays.asList(3,2);
		System.out.println("-------- "+minimumTime(list1,list2, 4));
	}

	public static int minimumTime(List<Integer> num1, List<Integer> num2, int x) {
        for(int i=0;i<num1.size();i++){
            boolean flag=false;
            int sum=0;
            for(int j=0;j<num1.size();j++){
            	sum=0;
                num1.set(j,num1.get(j)+num2.get(j));
                num1.set(i,0);
                for (int h = 0; h < num1.size(); h++)
                    sum += num1.get(h);

                System.out.print("***"+sum);
                if(sum==x){
                    System.out.print("***"+sum);
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
