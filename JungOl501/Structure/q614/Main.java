package q614;

import java.util.Scanner;

class Student {
	private String schoolName;
	private int grade;

	Student(String schoolName, int grade) { // 생성자
		this.schoolName = schoolName;
		this.grade = grade;
	}

	void print() {
		System.out.println(grade + " grade in " + schoolName + " School");
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String schoolName = sc.next();
		int grade = sc.nextInt();
		sc.close();

		Student st1 = new Student("Jejuelementary", 6);
		Student st2 = new Student(schoolName, grade);
		st1.print();
		st2.print();
	}
}