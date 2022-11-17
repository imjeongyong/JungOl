import java.util.Scanner;

public class Array150 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = new char[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next().charAt(0);
		}
		sc.close();

		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
	}
}