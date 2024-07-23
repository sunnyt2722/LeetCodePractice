package Matrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumberMatrix {
//	1380. Lucky Numbers in a Matrix
	public static void main(String args[]){
        LuckyNumberMatrix obj= new LuckyNumberMatrix();
        int matrix[][] = {{3,7,8},{9,11,13},{15,16,17}}; 
        System.out.println(obj.luckyNumbers(matrix));
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
    	List<Integer> luckyNums = new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            int minVal =Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<minVal){
                    minVal = matrix[i][j];
                    minIndex=j;
                }
            }
            boolean isLuckyNumber=true;
            for(int k=0;k<matrix.length;k++){
                if(matrix[k][minIndex]>minVal){
                    isLuckyNumber=false;
                    break;
                }
            }
            if(isLuckyNumber){
                luckyNums.add(minVal);
            }
        }
        return luckyNums;
    }
}
