package ChapterFiveExercises;

public class ChristmasSong {
    public static void main(String[] args) {

        int userPrompt = 1;
        String day = "";

        do {
            switch (userPrompt) {

                case 1:
                    day = "first day";
                    break;
                case 2:
                    day = "second day";
                    break;
                case 3:
                    day = "Third day";
                    break;
                case 4:
                    day = "Fourth day";
                    break;
                case 5:
                    day = "Fifth day";
                    break;
                case 6:
                    day = "Sixth day";
                    break;
                case 7:
                    day = "Seventh day";
                    break;
                case 8:
                    day = "Eight day";
                    break;
                case 9:
                    day = "Ninth day";
                    break;
                case 10:
                    day = "Tenth day";
                    break;
                case 11:
                    day = "Eleventh day";
                    break;
                case 12:
                    day = "Twelfth day";
                    break;
            }
            System.out.printf("on the %s of christmas my true love gave to me%n", day);

            switch (userPrompt) {
                case 12:
                    System.out.println("Twelve drummers drumming");
                case 11:
                    System.out.println("eleven pipers piping");
                case 10:
                    System.out.println("Ten lords a leaping,");
                case 9:
                    System.out.println(" nine ladies dancing,");
                case 8:
                    System.out.println(" eight maids a milking");
                case 7:
                    System.out.println(" Seven swans a swimming,");
                case 6:
                    System.out.println(" six geese a laying,");
                case 5:
                    System.out.println(" five gold rings");
                case 4:
                    System.out.println(" Four calling birds,");
                case 3:
                    System.out.println(" three French hens");
                case 2:
                    System.out.println(" Two turtle doves and");
                case 1:
                    System.out.println("a partridge in a pear tree");
            }
            System.out.println();
            userPrompt++;
        }while (userPrompt <= 12);
    }
}

