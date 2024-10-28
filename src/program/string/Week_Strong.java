package program.string;
//s="1abcty67"; o/p=week
//s="1cobcty67"; o/p=strong
//s="ab1234sdhfh";o/p=week
//s="aed12dh3rh"; o/p=strong

public class Week_Strong {
	public static void main(String[] args)
	{
		String s="1cobcty67";
		boolean flag =false;
		for(int i=0;i<s.length()-2;i++)
		{
			char c=s.charAt(i);
			if(s.charAt(i+1)==c+1&&s.charAt(i+2)==c+2)
			{
				flag=true;break;
			}
			
		}
		if(flag==true)
		{
			System.out.println("Week string");
		}
		else {
			System.out.println("Strong string");
		}
	}
}