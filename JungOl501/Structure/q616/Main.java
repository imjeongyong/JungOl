package q616;

import java.util.Scanner;

class Tri {
	int x;
	int y;

	public Tri(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		for(int i = 0; i<3; i++) {
			
		}
		return x;
	}

	public double getY() {
		return y;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tri[] coor = new Tri[3];
		for (int i = 0; i < coor.length; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			coor[i] = new Tri(x, y);
		}
		sc.close();

	}
}