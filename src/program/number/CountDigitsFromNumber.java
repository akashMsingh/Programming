package program.number;

public class CountDigitsFromNumber {
	public static void main(String[] args) {
		int num=12345;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println("Number of Digits: "+count);
	}
}
