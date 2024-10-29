package program.number;

public class SpyNumber {
	public static void main(String[] args) {
		int num = 22;
		int mult = 1;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			mult = mult * rem;
			sum = sum + rem;
			num = num / 10;
		}
		if (mult == sum) {
			System.out.println("SpyNumber");
		} else {
			System.out.println("Not SpyNumber");
		}
	}
}
