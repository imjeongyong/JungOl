public class Output506 {
	public static void main(String[] args) {
		int height = 170;
		double d = 68.6;

		System.out.println("My height");
		System.out.println(height);
		System.out.println("My weight");
		System.out.printf("%2.6f", d);
	}
}



/* 모범답안
public class Output506 {
	public static void main(String[] args) {
		String str1 = "My height";
		int height = 170;
		String str2 = "My height";
		double d = 68.6;

		System.out.println(str1);
		System.out.println(height);
		System.out.println(str2);
		System.out.printf("%.6f", d);
	}
}

*/