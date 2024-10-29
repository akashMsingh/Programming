package program.number;

public class SwapTwoNumberWithoutUsingTemp {
	public static void main(String[] args) {
		int n1=10;
		int n2=20;
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("n1: "+n1+"\nn2: "+n2);
	}
}
