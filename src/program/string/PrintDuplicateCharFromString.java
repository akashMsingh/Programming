package program.string;

public class PrintDuplicateCharFromString {
	public static void main(String[] args) {
		String str = "hello";
		char[] c1 = str.toCharArray();
		char[] c2 = str.toCharArray();
		System.out.println("==========Duplicate Character==========");
		for (int i = 0; i < c1.length; i++) {
			int count = 0;
			for (int j = 0; j < c1.length; j++) {
				if (c1[i] == c2[j]) {
					count++;
					c2[j] = '\0';
				}
			}
			if (count > 1) {
				System.out.println(c1[i]);
			}
		}
	}
}
