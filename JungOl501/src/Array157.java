import java.util.Scanner;

public class Array157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			count = count + 1;

			if (arr[i] == 0)
				break;
		}
		sc.close();

		int sum = 0;
		int count1 = 0;
		for (int j = 0; j < count - 1; j++) {
			if (arr[j] % 5 == 0) {
				sum = sum + arr[j];
				count1 = count1 + 1;
			}
		}

		System.out.println("Multiples of 5 : " + count1);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", (double) sum / count1);
	}
}