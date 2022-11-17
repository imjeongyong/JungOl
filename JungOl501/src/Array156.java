import java.util.Scanner;

public class Array156 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[100];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			count = count + 1;

			if (arr[i] == 999)
				break;
		}
		sc.close();

		for (int j = 0; j < count - 1; j++) {
			for (int k = 0; k < count - 1; k++) {
				if (arr[k] < arr[k + 1]) {
					int tmp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = tmp;
				}
			}
		}
		System.out.println("max : " + arr[1]);
		System.out.println("min : " + arr[count - 1]);
	}
}