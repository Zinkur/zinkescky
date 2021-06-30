package africa.semicolon.Chapter7;

import java.util.Scanner;

public class Questionnaire {
    private static String question;

    public static void main(String[] args) {
        String[][] myersBriggs = {{"A. expand energy,enjoy groups", "B. conserve energy,enjoy one-on-one" },
                {"A. interpret literally", "B. look for meaning and possibilities" },
                {"A. logical,thinking,questioning", "B. empathetic,feeling,accommodating" },
                {"A. organized,orderly", "B. flexible,adaptable" },
                {"A. more outgoing,think out loud", "B. more reserved,think to yourself" },
                {"A. practical,realistic,experiential", "B. imaginative,innovative,theoretical" },
                {"A. candid,straight forward,frank", "B. tactful,kind,encouraging" },
                {"A. plan,schedule", "B. unplanned,spontaneous" },
                {"A. seek many task,public activities,interaction with others", "B. seek private,solitary activities with quiet to concentrate" },
                {"A. standard,usual,conventional", "B. different,novel,unique" },
                {"A. firm,tend to criticize,hold the line", "B. gentle,tend to appreciate,conciliate" },
                {"A. regulated,structured", "B. easygoing,live and let live" },
                {"external,communicative,express yourself", "B. internal,reticent,keep to yourself" },
                {"A. focus on here-and-now", "B. look to the future,global perspective,big picture" },
                {"A. tough-minded,just", "B. tender hearted,merciful" },
                {"A. preparation,plan ahead", "B. go with the flow,adapt as you go" },
                {"A. active,initiate", "B. reflective,deliberate" },
                {"A. facts,things,what is", "B. ideas,dreams,what could be,philosophical" },
                {"A. matter of fact,issue-oriented", "B. sensitive,people-oriented,compassionate" },
                {"A. control,govern", "B. latitude,freedom" }};

        int questionNumber = 1;
        Scanner input = new Scanner(System.in);
        char[] answers = new char[myersBriggs.length];

        for (int i = 0; i < myersBriggs.length; i++) {
            System.out.println("Question" + questionNumber);
            System.out.println("choose the question you want");

            for (int j = 0; j < 2; j++) {
                System.out.println(myersBriggs[i][j]);
            }
            answers[i] = input.next().charAt(0);
            System.out.println();
            questionNumber++;
        }
        String tableHeader = String.format("%5s%5s%5s", " ", "A", "B");

        System.out.print(tableHeader.repeat(4));
        System.out.println();

        for (int i = 1; i <= myersBriggs.length; i = i + 4) {

            if (answers[i - 1] == 'A' || answers[i - 1] == 'a') {
                System.out.printf("%5s%5s%5s", " ", "A", " ");
            } else {
                System.out.printf("%5s%5s%5s", " ", " ", "B");
            }
            if (answers[i] == 'A' || answers[i] == 'a') {
                System.out.printf("%5s%5s%5s", " ", "A", " ");
            } else {
                System.out.printf("%5s%5s%5s", " ", " ", "B");
            }
            if (answers[i + 1] == 'A' || answers[i + 1] == 'a') {
                System.out.printf("%5s%5s%5s", " ", "A", " ");
            } else {
                System.out.printf("%5s%5s%5s", " ", " ", "B");
            }
            if (answers[i + 2] == 'A' || answers[i + 2] == 'a')
            {
                System.out.printf("%5s%5s%5s", " ", "A", "");
            } else {
                System.out.printf("%5s%5s%5s", " ", " ", "B");
            }
            System.out.println();
        }
        System.out.printf("%5s", "Total");
    }
}