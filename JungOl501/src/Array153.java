import java.util.Scanner;

public class Array153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == -1) {
				if (i > 3) {
					for (int j = i - 3; j <= i - 1; j++) {
						System.out.print(arr[j] + " ");
					}
					break;
				} else if (i <= 3) {
					for (int k = 0; k < i; k++) {
						System.out.print(arr[k] + " ");
					}
				}
				break;
			}
		}
		sc.close();
	}
}