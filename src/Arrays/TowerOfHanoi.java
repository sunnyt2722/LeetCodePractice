package Arrays;

public class TowerOfHanoi {

	public static void main(String[] args) {
		towerOfHanoi(3, "Rod 1 ", "Rod 3", "Rod 2");
	}
	
	public static void towerOfHanoi(int numberOfDisks, String fromRod, String toRod, String midRod) {
		if(numberOfDisks==0) {
			return;
		}
		towerOfHanoi(numberOfDisks-1, fromRod, midRod, toRod);
		System.out.println("Moving disk from "+numberOfDisks+ " from "+fromRod+" rod to "+toRod);
		towerOfHanoi(numberOfDisks-1, midRod, toRod, fromRod);
	}
}
