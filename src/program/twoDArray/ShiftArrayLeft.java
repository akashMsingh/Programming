package program.twoDArray;
//Write a java program to shift the array one column left
public class ShiftArrayLeft {
	static void leftShift(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length-1;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[i][j+1];
				arr[i][j+1]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, }, { 4, 5, 6 }, { 7, 8, 9 } };
		leftShift(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
