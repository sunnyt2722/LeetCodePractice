package Recurssion;

public class JosephusProblem {

	public static void main(String[] args) {
		System.out.println("----"+josProblem(5, 3));
	}
	
	public static int josProblem(int n,int k) {
		if(n==1)
			return 0;
		return (josProblem(n-1, k)+k)%n;
	}
	
}
