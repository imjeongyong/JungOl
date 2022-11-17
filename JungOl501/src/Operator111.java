import java.util.Scanner;

public class Operator111 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s1 = sc.nextInt();
		int s2 = sc.nextInt();
		int s3 = sc.nextInt();
		int s4 = sc.nextInt();
		sc.close();

		int sum = s1 + s2 + s3 + s4;
		int avg = sum / 4;

		System.out.printf("sum %d\navg %d\n", sum, avg);
	}
}