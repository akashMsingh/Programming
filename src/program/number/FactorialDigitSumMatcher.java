package program.number;

import java.util.Scanner;

public class FactorialDigitSumMatcher {
	static int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
			{
				fact=fact*i;
			}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int sum=0;
			int num2=i;
			while(num2>0) {
				int rem=num2%10;
				sum=sum+factorial(rem);
				num2=num2/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}
}

