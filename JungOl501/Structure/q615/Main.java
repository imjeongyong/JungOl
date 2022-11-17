package q615;

import java.util.Scanner;

class Student {
	private String name;
	private int korScore;
	private int engScore;

	public Student(String name, int korScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
	}

	public void print() {
		System.out.println(name + " " + korScore + " " + engScore);
	}

	public int getKor() {
		return korScore;
	}

	public int getEng() {
		return engScore;
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] stu = new Student[2];

		for (int i = 0; i < stu.length; i++) {
			String name = sc.next();
			int sc1 = sc.nextInt();
			int sc2 = sc.nextInt();

			stu[i] = new Student(name, sc1, sc2);
			stu[i].print();
		}
		sc.close();

		int sumKor = 0, sumEng = 0;
		for (int i = 0; i < stu.length; i++) {
			sumKor += stu[i].getKor();
			sumEng += stu[i].getEng();
		}
		System.out.println("avg " + sumKor / stu.length + " " + sumEng / stu.length);
	}
}