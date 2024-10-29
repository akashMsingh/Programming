package program.number;

public class IpAddress {
	public static void main(String[] args) {
		String str = "-1.121.221.252";
		String[] s = str.split("[.]");
		boolean flag = true;
		if (s.length == 4) {
			for (String n : s) {
				int num = Integer.parseInt(n);
				if (num<0 || 255<num) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		System.out.println(flag==true?"Valid IpAddress":"Invalid IpAddress");
	}
}

