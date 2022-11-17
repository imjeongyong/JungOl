import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		sc.close();

		double sum = 0;
		for (int j = 0; j < arr.length; j++) {
			sum = sum + arr[j];
		}
		System.out.printf("SUM = %.1f\nAVG = %.1f", sum, sum / arr.length);
	}
}