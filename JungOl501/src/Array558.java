import java.util.Scanner;

public class Array558 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

			if (arr[i] == 0) {
				for (int j = i - 1; j >= 0; j--) {
					System.out.print(arr[j] + " ");
				}
				break;
			}
		}
		sc.close();
	}
}