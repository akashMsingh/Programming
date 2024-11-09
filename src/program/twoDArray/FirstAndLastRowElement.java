package program.twoDArray;

import java.util.Scanner;
//Write a java program to print first and last row of an array
public class FirstAndLastRowElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		System.out.println("Enter the col: ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the element of Array: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(i==0||i==arr.length-1) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
