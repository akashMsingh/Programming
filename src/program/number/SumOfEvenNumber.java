package program.number;

import java.util.Scanner;

public class SumOfEvenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int i=1;
		int sum=0;
		while(num>=i)
		{
			if(i%2==0)
				sum=sum+i;
			i++;
		}
		System.out.println("Sum Of Even Number: "+sum);
		sc.close();
	}
}
