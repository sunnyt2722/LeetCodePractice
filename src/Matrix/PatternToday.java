package Matrix;

public class PatternToday {

	public static void main(String[] args) {
		for(int i=0;i<15;i++) {
			if(i%5 == 1 || i%5==3) {
				System.out.print(" ");
			}
			else if(i%5 == 2) {
				System.out.print("  ");
			}
			System.out.println("*");
		}
	}
}
