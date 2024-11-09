package program.twoDArray;

import java.util.Scanner;

public class EvenElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row: ");
		int row=sc.nextInt();
		System.out.println("Enter the col: ");
		int col=sc.nextInt();
		int[][] arr=new int[row][col];
		System.out.println("Enter the element of Array:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) {
					System.out.print(arr[i][j]+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
