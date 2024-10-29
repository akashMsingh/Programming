package program.number;

public class DecimalToBinary {
	public static void main(String[] args) {
		int num=13;
		String str="";
		while(num!=0)
			{
				int rem=num%2;
				str=rem+str;
				num=num/2;
			}
		System.out.println(str);
	}
}

