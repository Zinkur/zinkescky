package africa.semicolon;

import java.util.Scanner;

public class Sixty {
    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);

        int firstInput;
        System.out.println("Enter the Number" );
        firstInput = scanner.nextInt();
        if(firstInput >= 60)
            System.out.println("Passed");
        if(firstInput < 60)
            System.out.println("Fail");
    }
}
