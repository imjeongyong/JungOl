import java.util.Scanner;

public class Array158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			count += 1;

			if (arr[i] == 0)
				break;
		}
		sc.close();

		System.out.println(count - 1);

		for (int j = 0; j < count - 1; j++) {
			if (arr[j] % 2 == 0) {
				System.out.print(arr[j] / 2 + " ");
			} else if (arr[j] % 2 != 0) {
				System.out.print(arr[j] * 2 + " ");
			}
		}
	}
}
