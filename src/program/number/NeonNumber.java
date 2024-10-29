package program.number;

public class NeonNumber {
	public static void main(String[] args) {
		int num=8;
		int sum=0;
		int mult=num*num;
		while(mult>0)
		{
			int rem=mult%10;
			sum=sum+rem;
			mult=mult/10;
		}
		if(sum==num)
		{
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not Neon Number");
		}
	}
}