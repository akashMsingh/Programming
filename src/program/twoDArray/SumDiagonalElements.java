package program.twoDArray;
//Write a java program to find sum of diagonal elements in an array
public class SumDiagonalElements {
	public static void main(String[] args) {
		int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j||i+j==arr.length-1) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println("Sum of Diagonal element of Array: "+sum);
	}
}
