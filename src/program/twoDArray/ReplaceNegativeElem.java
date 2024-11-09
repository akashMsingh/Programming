package program.twoDArray;
//Write a java program to replace all negative elements of an array by 0 (zero).
public class ReplaceNegativeElem {
	public static void main(String[] args) {
		int[][] arr={{1,-2,3,},{4,5,6},{-7,8,9}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]<0) {
					arr[i][j]=0;
				}
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
