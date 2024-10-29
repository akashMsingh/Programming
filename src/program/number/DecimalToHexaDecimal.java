package program.number;

public class DecimalToHexaDecimal {
	public static void main(String[] args) {
		int num=31;
		String str="";
		char c=64;
		while(num!=0)
		{
			int rem=num%16;
			if(rem>9)
			{
				rem=rem-9;
				c=(char)(c+rem);
				str=c+str;
			}
			else {
				str=rem+str;
			}
			num=num/16;
		}
		System.out.println(str);
	}
}
