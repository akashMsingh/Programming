package program.number;

public class ArmStrongNumber {
	static int count(int num)
	{
		int c=0;
		while(num!=0)
		{
			c++;
			num=num/10;
		}
		return c;
	}
	static int power(int ex,int n)
	{
		int pow=1;
		int i=1;
		while(i<=ex)
			{
				pow=pow*n;
				i++;
			}
		return pow;
	}
	public static void main(String[] args) {
		int num=153;
		int num2=num;
		int ex=count(num);
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+power(ex,rem);
			num=num/10;
		}
		System.out.println(sum==num2?"ArmstrongNumber":"Not a ArmstrongNumber");
	}
}
