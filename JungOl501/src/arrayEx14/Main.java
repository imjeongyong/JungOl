package arrayEx14;

public class Main {
	public static void main(String[] args) {
		String src = "ABCDE";

		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt(" + i + "):" + ch);
		}

		char[] chArr = src.toCharArray();

		System.out.println(chArr);
	}
}