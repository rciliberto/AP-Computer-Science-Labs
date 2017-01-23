package lecture_18;

public class MagicSquare {	
	public static int rowSum(int[][] square, int row){
		int sum=0;
		for(int i=0; i<square.length; i++){
			sum+=square[row][i];
		}
		return sum;
	}
	
	public static int colSum(int[][] square, int col){
		int sum=0;
		for(int i=0; i<square.length; i++){
			sum+=square[i][col];
		}
		return sum;
	}
	
	public static boolean diagSums(int[][] square, int sum){
		int major=0, minor=0;
		int size=square.length;
		
		for(int i=0; i<size; i++){
			major+=square[i][i];
			minor+=square[size-i-1][size-i-1];
		}
		return (major==sum && minor==sum);
	}
	
	public static boolean exactlyOnce(int[][] square){
		int size=square.length, sum=supposedSum(square), total=0;
		
		for(int i=0; i<size; i++){
			total+=rowSum(square, i);
		}
		return sum==total;
	}
	
	public static boolean isMagic(int[][] square){
		boolean rowCol=true;
		
		for(int i=0; i<square.length; i++){
			for(int j=0; j<square.length; j++){
				if(rowSum(square,i)!=colSum(square,j)) rowCol=false;
			}
		}
		return rowCol && diagSums(square,rowSum(square,0)) && exactlyOnce(square);
	}
	
	//My own implementation to avoid unnecessary clutter
	private static int supposedSum(int[][] square){	//Returns the supposed sum of a magic square on the column, row, and diagonals
		int sum=0;
		for(int i=1; i<=Math.pow(square.length,2); i++) 
			sum+=i;
		return sum;
	}
}
