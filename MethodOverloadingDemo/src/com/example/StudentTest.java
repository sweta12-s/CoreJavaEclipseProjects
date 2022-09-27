package com.example;

import java.util.Scanner;

public class StudentTest {

	static void displayStudents(Student[] s1) {
		for (Student obj : s1) {
			System.out.println("Name:" + obj.getName() + "Score:" + obj.getScore() + "Course:" + obj.getCourse());
		}

	}

	// method overloading
	static void displayStudents(Student[] s1, double marks) {
		for (Student obj : s1) {
			if (obj.getScore() >= marks)

				System.out.println("Name:" + obj.getName() + "Score:" + obj.getScore() + "Course:" + obj.getCourse());

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student s[] = new Student[5];
		s[0] = new Student(1, "Sweety", 24, 80.1);
		s[1] = new Student(2, "Sudip", 22, 78.0, "MCA");
		s[2] = new Student(3, "Rahul", 18, 90.8);
		s[3] = new Student(4, "Piya", 20, 95.2, "MCA");
		s[4] = new Student(5, "Mohon", 19, 97.3, "MCA");

		int ch;
		System.out.println("Enter 1 to see all students name:");
		System.out.println("Enter 2 to see students obove 90:");
		System.out.println("Enter your choice:");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			displayStudents(s);
			break;
		case 2:
			displayStudents(s, 90.0);
			break;
		default:
			System.out.println("Wrong input");

		}

		sc.close();

	}

}
