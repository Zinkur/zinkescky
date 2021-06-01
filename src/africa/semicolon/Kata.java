package africa.semicolon;

public class Kata {

    public static void main(String[] args) {

        int number1 = 12345/10000;
        int number2 = (12345/1000) %10;
        int number3 = (12345/100) %10;
        int number4 =(12345/10) %10;
        int number5 = (12345) %10;
        System.out.println(number5);
        number5*=10000;
        number4*=1000;
        number3*=100;
        number2*=10;
        number1*=2



    }
    public int findFactorialOf(int number){
        int factorial = 1;

        while (number >1){
            factorial *= number;
            number--;
        }
        return factorial;
    }
}