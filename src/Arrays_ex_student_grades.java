// enter student count
// enter first exams
// take the average of the grades

import java.util.Scanner;

public class Arrays_ex_student_grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("how many grades will be entered: ");
        int studentCount = scanner.nextInt();

        int[] gradeArray = new int[studentCount];

        for (int i = 0; i < studentCount; i++){
            System.out.println((i + 1) + ". student's grade: ");
            int grade = scanner.nextInt();
            gradeArray[i] = grade;
        }
        double sum = 0;
        for (int i = 0; i < gradeArray.length; i++){
            sum = sum + gradeArray[i];
        }
        double averageGrade = sum / studentCount;
        System.out.println("The average grade of the class is: " + averageGrade);
    }
}
