package Arrays;

public class THN {

	public static void main(String[] args) {
		towerOfHanoi(3, 'A', 'B', 'C');
	}
	
	public static void towerOfHanoi(int num, char src, char dest, char aux) {
		if(num==0) {
			return;
		}
		towerOfHanoi(num-1,src,aux,dest);
		System.err.println("Moving disk "+num+" from "+src+" to "+dest);
		towerOfHanoi(num-1, aux, dest, src);
	}
}
