package function1.q572;

import java.util.Scanner;

public class Main {

	double pi = 3.14;

	public double cal(double r) {
		double result = r * r * pi;
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();

		Main main = new Main();
		double result = main.cal(r);
		System.out.printf("%.2f", result);
	}
}