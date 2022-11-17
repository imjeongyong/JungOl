/*
public class Output508 {
	public static void main(String[] args) {
		System.out.printf("%10s%10s%10s\n", "item", "count", "price");
		System.out.printf("%10s%10s%10s\n", "pen", "20", "100");
		System.out.printf("%10s%10s%10s\n", "note", "5", "95");
		System.out.printf("%10s%10s%10s\n", "eraser", "110", "97");
	}
}
*/

/*
public class Output508 {
	public static void main(String[] args) {
		System.out.printf("%10s%10s%10s\n%10s%10s%10s\n%10s%10s%10s\n%10s%10s%10s\n", "item", "count", "price",
				"pen", "20", "100", "note", "5", "95", "eraser", "110", "97");
	}
}
*/

//public class Output508 {
//	public static void main(String[] args) {
//		//배열을 이용한 코드
//		String[] str = {"item", "count", "price",
//				"pen", "20", "100",
//				"note", "5", "95",
//				"eraser", "110", "97"};
//		for(int i = 0; i <= 11 ; i++) {
//			if (i % 3 ==0 && i != 0) {
//				System.out.printf("\n");
//			}
//			System.out.printf("%10s", str[i]);
//		}
//	}
//}

public class Output508 {
	public static void main(String[] args) {
		String[] str = { "item", "count", "price", "pen", "20", "100", "note", "5", "95", "eraser", "110", "97" };

		for (int i = 0; i < str.length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.printf("\n");
			}
			System.out.printf("%10s", str[i]);
		}
	}
}
