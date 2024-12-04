package Arrays;

import java.util.List;

public class Practice {

	
	public static void main(String[] args) {
//		System.out.println(reversString("Test"));
//		swapNumbers(4, 6);
//		System.out.println(checkVowels("Sunny"));
//		System.out.println(checkVowels("Svnny"));
//		System.out.println(isPrimeNumber(41));
//		System.out.println(isPrimeNumber(42));
//		fibonacciSeries(10);
//		int num = 10;
//		for(int i=0;i<=num;i++)
//			System.out.println(fibonacciRecurssion(i));
//		
//		System.out.println(checkPalindrome("ABCBA"));
//		System.out.println(checkPalindrome("ABCBB"));
//		System.out.println(removeSpaces("This is space test"));
//		System.out.println(removeLeadingAndTrailingSpaces("     This is leading space test      "));
//		int arr[]= {34,35,62,13,57,72};
//		sortArray(arr);
		System.out.println(factorialRecurssion(7));
		
	}
	
	private static long factorialRecurssion(int num) {
		if(num==1)
			return 1;
		return factorialRecurssion(num-1)*num;
	}

	public static String reversString(String str) {
		StringBuilder stringBuilder = new StringBuilder();
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			stringBuilder.append(ch[i]);
		}
		return stringBuilder.toString();
	}
	
	public static void swapNumbers(int a, int b) {
		System.out.println("----Swap Start----");
		System.out.println("Number one is "+a+" and number two is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Number one is "+a+" and number two is "+b);
		System.out.println("----Swap End----");
	}
	
	public static boolean checkVowels(String str) {
		return str.toLowerCase().matches(".*[aeiou].*");
	}
	
	public static boolean isPrimeNumber(int number) {
		if(number==0||number==1)
			return false;
		else if(number==2)
			return true;
		else
			for(int i=2;i<number/2;i++) {
				if(number%i==0) {
					return false;
				}
			}
		return true;
	}

	public static void fibonacciSeries(int seriesTill) {
		int a=0;
		int b=1;
		int fibo=1;
		for(int i=0;i<seriesTill;i++) {
			System.out.println(fibo);
			a=b;
			b=fibo;
			fibo=a+b;
		}
	}
	
	public static int fibonacciRecurssion(int count) {
		if(count<=1)
			return count;
		return fibonacciRecurssion(count-1)+fibonacciRecurssion(count-2);
	}

	public static boolean onlyOddInList(List<Integer> list) {
		for(int i:list)
			if(i%2==0)
				return false;
		return true;
	}
	
	public static boolean checkPalindrome(String str) {
		int lengthOfStr=str.length();
		for(int i=0;i<lengthOfStr/2;i++) {
			if(str.charAt(i)!=str.charAt(lengthOfStr-1-i))
				return false;
		}
		return true;
	}

	public static String removeSpaces(String str) {
		StringBuilder sBuilder = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ')
				sBuilder=sBuilder.append(str.charAt(i));
		}
		return sBuilder.toString();
	}
	
	public static String removeLeadingAndTrailingSpaces(String str) {
		return str.strip();
	}
	
	private static void sortArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
		
	}

}
