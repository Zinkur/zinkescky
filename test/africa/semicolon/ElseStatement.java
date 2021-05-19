package africa.semicolon;

import java.util.Scanner;

public class ElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Score: ");
        int score;
        score = scanner.nextInt();
        if (score >= 90) {
            System.out.println("A");
        }else
            if (score >= 80) {
                System.out.println("B");
            }else
                if (score >= 70){
            System.out.println("C");
        }else
            if (score >= 60){
            System.out.println("D");
        }
            if (score < 60) {
                System.out.println("F");
            }
    }
}
