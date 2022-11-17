import java.util.Scanner;

public class Array152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int odd = 0;
		int even = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int j = 0; j < arr.length; j = j + 2) {
			odd = odd + arr[j];
		}
		for (int k = 1; k < arr.length; k = k + 2) {
			even = even + arr[k];
		}

		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}
}