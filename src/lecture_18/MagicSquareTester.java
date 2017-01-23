package lecture_18;

public class MagicSquareTester {
	public static void main(String[] args) {
		int[][] square4={{16,3,2,13},{5,10,11,8},{9,6,7,12},{4,15,14,1}};
		
		System.out.println(MagicSquare.rowSum(square4, 0));
		System.out.println(MagicSquare.colSum(square4, 0));

		System.out.println(MagicSquare.diagSums(square4, 34));
		System.out.println(MagicSquare.exactlyOnce(square4));
		
		System.out.println(MagicSquare.isMagic(square4));
	}
}
