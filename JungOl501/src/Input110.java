import java.util.Scanner;

public class Input110 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("yard? ");
		double d1 = sc.nextDouble();
		System.out.printf("%.1fyard = %.1fcm", d1, d1 * 91.44);

		sc.close();
	}
}