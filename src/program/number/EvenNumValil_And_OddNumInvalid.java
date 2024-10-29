package program.number;

public class EvenNumValil_And_OddNumInvalid {
	static int count(int num)
	{
		int c=0;
		while(num>0)
		{
			c++;
			num=num/10;
		}
		return c;
	}
	static int power(int ex,int n)
	{	
		int pow=1;
		for(int i=1;i<=ex;i++)
		{
			pow=pow*n;
		}
		return pow;
	}
	public static void main(String[] args) {
		int num=1234;
		int ex=count(num);
		if(ex%2==0)
		{
			int d=power(ex/2,10);
			System.out.println("Sum of : "+(num/d+num%d));
		}
		else {
			System.out.println("Invalid Number");
		}
	}
}

