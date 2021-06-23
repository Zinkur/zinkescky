package Chappter2Exercise;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int LargestNumber = 0;
        int SmallestNumber = 0;
        System.out.println("Enter first Number");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = input.nextInt();
        System.out.println("Enter fourth number");
        int fourthNumber = input.nextInt();
        System.out.println("Enter fifth number");
        int fifthNumber = input.nextInt();

        if (firstNumber < secondNumber) {
            LargestNumber = secondNumber;
        }
        if (secondNumber < thirdNumber) {
            LargestNumber = thirdNumber;
        }
        if (thirdNumber < fourthNumber) {
            LargestNumber = fourthNumber;
        }
        if (fourthNumber < fifthNumber) {
            LargestNumber = fifthNumber;
        }
        if (firstNumber < secondNumber) {
            SmallestNumber = firstNumber;
        }
            if (firstNumber < thirdNumber) {
                SmallestNumber = firstNumber;
            }
            if (firstNumber < fourthNumber) {
                SmallestNumber = firstNumber;
            }
            if (firstNumber < fifthNumber) {
                SmallestNumber = firstNumber;
            }

            System.out.println("Largest number is:" + LargestNumber);
            System.out.println("Smallest number is:" + SmallestNumber);
        }
    }


