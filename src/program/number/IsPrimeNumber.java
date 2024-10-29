package program.number;

import java.util.Scanner;

public class IsPrimeNumber {
	public static boolean isPrime(int num)
	{
		int c=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		return c==2;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number to Check Prime Or Not");
		int num=sc.nextInt();
		boolean flag=isPrime(num);
		System.out.println(flag==true?"PrimeNumber":"Not PrimeNumber");
		sc.close();
	}
}

