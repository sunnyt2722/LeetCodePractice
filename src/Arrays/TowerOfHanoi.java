package Arrays;

public class TowerOfHanoi {

	public static void main(String[] args) {
		towerOfHanoi(3, 'A', 'B', 'C');
	}
	
	public static void towerOfHanoi(int numberOfDisks, char sourceRod, char destinationRod, char auxRod) {
		if(numberOfDisks==0) {
			return;
		}
		towerOfHanoi(numberOfDisks-1, sourceRod, auxRod, destinationRod);
		System.out.println("Moving disk from "+numberOfDisks+ " from "+sourceRod+" rod to "+destinationRod);
		towerOfHanoi(numberOfDisks-1, auxRod, destinationRod, sourceRod);
	}
}
