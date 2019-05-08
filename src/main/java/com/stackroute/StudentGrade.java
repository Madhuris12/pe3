package com.stackroute;

import java.util.Scanner;

public class StudentGrade {
    private final int LOWER_GRADE = 0;
    private final int HIGHER_GRADE = 100;
    private int[] grades;

    private Scanner in;

    public static void main(String[] args) {
        StudentGrade aGradesAverage = new StudentGrade();
        aGradesAverage.in = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = aGradesAverage.in.nextInt();

        aGradesAverage.run(numStudents);
    }

    private void run(int numStudents) {
        if (numStudents <= 0) {
            System.out.println("Invalid number of students.");
            return;
        }
        grades = new int[numStudents];

        double sum = 0;
        int i = 0;
        while (i < numStudents) {
            System.out.printf("Enter the grade for student %1$d: ", (i + 1));
            int grade = in.nextInt();
            if ((grade >= LOWER_GRADE) && (grade <= HIGHER_GRADE)) {
                grades[i] = grade;
                sum += grade;
                i++;
                continue;
            }
            System.out.println("Invalid grade, try again...");
        }
        System.out.printf("The average is %1$.2f\n", (sum / numStudents));
    }

}
