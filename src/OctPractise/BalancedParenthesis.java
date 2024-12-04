package OctPractise;

public class BalancedParenthesis {

	public static void main(String[] args) {
		String string = "[{asasadasdadas][sadadas}asasadasd]()(adada{asad})";
		checkParenthesis(string);
	}
	
	
	public static void checkParenthesis(String string) {
		int squareCounter=0,roundCounter=0,curlyCounter=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i) == '[') {
				squareCounter++;
			}
			if(string.charAt(i)==']'&&squareCounter>0) {
				squareCounter--;
			}
			if(string.charAt(i) == '(') {
				roundCounter++;
			}
			if(string.charAt(i)==')'&&roundCounter>0) {
				roundCounter--;
			}
			if(string.charAt(i) == '{') {
				curlyCounter++;
			}
			if(string.charAt(i)=='}'&&curlyCounter>0) {
				curlyCounter--;
			}
		}
		System.out.println(squareCounter);
		System.out.println(roundCounter);
		System.out.println(curlyCounter);
	}
	
}
