import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		for (int j = 0; j < arr.length - 1; j++) {
			for (int k = 0; k < arr.length - 1; k++) {
				if (arr[k] < arr[k + 1]) {
					int tmp = arr[k];
					arr[k] = arr[k + 1];
					arr[k + 1] = tmp;
				}
			}
		}
		System.out.println("max : " + arr[0] + " , min : " + arr[5]);
//		int min = Integer.MIN_VALUE; // : 인티저 타입에서 제일 작은 값
//		int max = Integer.MAX_VALUE; // : 인티저 타입에서 제일 큰 값
	}
}