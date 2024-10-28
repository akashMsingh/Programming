package program.string;

import java.util.Scanner;

public class SumOfNumberUsingString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sring Number: ");
		String strNum=sc.next();
		int sum=0;
		for(int i=0;i<strNum.length();i++) {
			if(strNum.charAt(i)>='0'&&strNum.charAt(i)<='9') {
				sum=sum+(strNum.charAt(i)-48);
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
