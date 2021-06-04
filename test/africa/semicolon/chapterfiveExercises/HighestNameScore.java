package africa.semicolon.chapterfiveExercises;

import java.util.Scanner;

public class HighestNameScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudent;
        int count = 1;
        String name;
        int score;
        int highestScore = 0;
        String studentWithHighScore = "";
        System.out.println("Enter number of Students");
        numberOfStudent = scanner.nextInt();

        do {
            System.out.println("Enter name of Student:");
            name = scanner.next();

            System.out.println("Enter the score of Student:");
            score = scanner.nextInt();
            if (highestScore < score) {
                highestScore = score;
                studentWithHighScore = name;
            }
            count++;

        } while (count <= numberOfStudent);
        System.out.printf("Student with the highest score is %s with %d", studentWithHighScore, highestScore);
    }
}