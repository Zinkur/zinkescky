package africa.semicolon.chapterfiveExercises;

import java.security.Principal;

public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.05;
        double amount = 0;
        double sum = 0;
        for (int n = 1;n <= 14; n++){
            principal = principal + principal * rate;
            if (n == 10){
                amount = principal;
            }
            if (n > 10){
                sum = sum + principal;
            }
        }
        System.out.printf("The Amount at 10 years is $%.3f%n",amount);
        System.out.printf("The sum for four years After 10 years is $%.3f%n",sum);
    }
}
