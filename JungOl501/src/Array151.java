import java.util.Scanner;

public class Array151 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		System.out.print(arr[0] + arr[2] + arr[4]);
	}
}