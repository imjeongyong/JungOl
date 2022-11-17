import java.util.Scanner;

public class Array561 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		int max = 0;
		int min = 9999;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 100) {
				if (arr[i] >= max) {
					max = arr[i];
				}
			} else if (arr[i] >= 100) {
				if (arr[i] <= min) {
					min = arr[i];
				}
			}
		}

		if (max == 0)
			max = 100;
		if (min == 9999)
			min = 100;

		System.out.print(max + " " + min);
	}
}