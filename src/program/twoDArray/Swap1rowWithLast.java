package program.twoDArray;
//Write a java program to swap first row with last row
public class Swap1rowWithLast {
	static void alterArr(int[][] arr) {
		int row1 = 0;
		int row2 = arr.length - 1;
		for (int col = 0; col < arr.length; col++) {
			int temp = arr[row1][col];
			arr[row1][col] = arr[row2][col];
			arr[row2][col] = temp;
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
