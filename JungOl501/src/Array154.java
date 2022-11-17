import java.util.Scanner;

public class Array154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();

		double sum = 0.0;
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
		}

		System.out.printf("%.1f", sum / arr.length);
	}
}
