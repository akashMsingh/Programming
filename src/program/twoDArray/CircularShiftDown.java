package program.twoDArray;
//Write a java program to Circular shift the array down
public class CircularShiftDown {
	static void shiftDown(int[][] arr) {
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<arr[i].length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i-1][j];
				arr[i-1][j]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
		shiftDown(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
