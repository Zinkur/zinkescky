package Chappter2Exercise;
import  java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        int number2 ;
        int sum;

        System.out.print("Enter the first number: ");
        number1 = input.nextInt();
        System.out.print("Enter second number:");
        number2 = input.nextInt();
        sum = number1 + number2;
        System.out.printf("Sum is %d%n", (number1 + number2));
    }

}
