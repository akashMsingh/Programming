package program.number;

public class FactorOfNumber {
	public static void main(String[] args) {
		int num=10;
		int count=0;
		String s="";
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				s=s+i+" ";
			}
		}
		System.out.println("Factor of Number is: "+count+"\nThat is: "+s);
	}
}
