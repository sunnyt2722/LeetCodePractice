package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		int arraySubArray[]= {10,5,20,25,30,35};
		int sum=35;
		System.out.println(countSubArray(arraySubArray, sum, 0));
		towerOfHanoi(4, 'A', 'B', 'C');
		System.out.println(powerOfNumber(4, 5));
		int matrix[][]= {{3,7,8},{9,11,13},{15,16,17}}; 
		List<Integer> luckyIntegers = luckyNumber(matrix);
		luckyIntegers.forEach(a -> System.out.println(a));
	}
	
	public static int countSubArray(int array[], int sum, int i) {
		if(sum==0)
			return 1;
		if(sum<0)
			return 0;
		if(array.length==i)
			return 0;
		return countSubArray(array, sum-array[i], i+1) + countSubArray(array, sum, i+1);
	}
	
	public static void towerOfHanoi(int diskCount, char src, char dest, char aux) {
		if(diskCount==0)
			return;
		towerOfHanoi(diskCount-1, src, aux, dest);
		System.out.println("Moved disk "+diskCount+" from tower "+src+" to "+dest);
		towerOfHanoi(diskCount-1, aux, dest, src);
	}
	
	public static Long powerOfNumber(int number, int power) {
		if(power==0)
			return 1L;
		return powerOfNumber(number, power-1)*number;
	}
	
	public static List<Integer> luckyNumber(int matrix[][]){
		List<Integer> luckyNumbers = new ArrayList<Integer>();
		for(int i=0;i<matrix.length;i++) {
			int minNumber = Integer.MAX_VALUE;
			int minIndex=-1;
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]<minNumber) {
					minNumber = matrix[i][j];
					minIndex = j;
				}
			}
			Boolean isLuckyNumber=true;
			for(int k=0;k<matrix.length;k++) {
				if(matrix[k][minIndex]>minNumber) {
					isLuckyNumber=false;
					break;
				}
			}
			if(isLuckyNumber)
				luckyNumbers.add(minNumber);
		}
		
		return luckyNumbers;
	}
}
