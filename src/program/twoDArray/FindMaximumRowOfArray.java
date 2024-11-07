package program.twoDArray;

import java.util.Scanner;

public class FindMaximumRowOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		System.out.println("Enter the col: ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the element of array: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max=0,c=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
			if(sum>max) {
				max=sum;c=i;
			}
		}
		System.out.println("maximum row of array: "+c+" and value: "+max);
		sc.close();
	}
}
