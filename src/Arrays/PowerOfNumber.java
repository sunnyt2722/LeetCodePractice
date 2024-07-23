package Arrays;

public class PowerOfNumber {

	public static void main(String[] args) {
		System.out.println(powerOfNumber(5, 4));
	}
	
	public static long powerOfNumber(int num, int power) {
		if(power == 0) {
			return 1;
		}
		return powerOfNumber(num, power-1)*num;
	}
}
