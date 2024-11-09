package program.twoDArray;
//Write a java program to swap first column with last column
public class Swap1stColWithLastCol {
	static void alterArr(int[][] arr) {
		int col1 = 0;
		int col2 = arr.length - 1;
		for (int row = 0; row < arr.length; row++) {
			int temp=arr[row][col1];
			arr[row][col1]=arr[row][col2];
			arr[row][col2]=temp;
		}
	}
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
		alterArr(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
