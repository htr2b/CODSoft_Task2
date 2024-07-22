package Grade;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		int numOfSub = sc.nextInt();
		int[] grades = new int[numOfSub];
		int totalGrade = 0;
		for (int i = 0; i < numOfSub; i++) {
			System.out.println("Enter grade for the " + (i + 1) + ". subject between 0-100");
			grades[i] = sc.nextInt();
			totalGrade += grades[i];
		}
		double averagePercentage = (double) totalGrade / numOfSub;
		char grade;

		if (averagePercentage >= 90) {
			grade = 'A';
		} else if (averagePercentage >= 80) {
			grade = 'B';
		} else if (averagePercentage >= 70) {
			grade = 'C';
		} else if (averagePercentage >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("Total Grades: " + totalGrade);
		System.out.println("Average Percentage: " + averagePercentage + "%");
		System.out.println("Grade: " + grade);

		sc.close();
	}
}
