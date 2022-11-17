import java.util.Scanner;

public class tjsxor530 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int age = sc.nextInt();
		sc.close();

//		System.out.println(age);

		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.printf("%d\n years later", 20 - age);
		}
	}
}