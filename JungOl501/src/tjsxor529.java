import java.util.Scanner;

public class tjsxor529 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();

//		System.out.println(height);
//		System.out.println(weight);

		int b = weight + 100 - height;

		System.out.println(b);
		if (b > 0) {
			System.out.print("Obesity");
		}
	}
}