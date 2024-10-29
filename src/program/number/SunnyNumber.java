package program.number;

import java.util.Scanner;

public class SunnyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int i = 0;
		boolean flag = false;
		while (i < num) {
			if (i * i == num + 1) {
				flag = true;
				break;
			}
			i++;
		}
		System.out.println(flag == true ? "Sunny Number" : "Not Sunny Number");
		sc.close();
	}
}
