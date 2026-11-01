import java.util.Arrays;
import java.util.Scanner;

public class FamousQuotes {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [] famousQuotes = {
                "I think, therefore I am. - René Descartes",
                "To be or not to be. - William Shakespeare",
                "The only thing we have to fear is fear itself. - Franklin D. Roosevelt",
                "Knowledge is power. - Francis Bacon",
                "I have a dream. - Martin Luther King Jr.",
                "That's one small step for man, one giant leap for mankind. - Neil Armstrong",
                "Be the change that you wish to see in the world. - Mahatma Gandhi",
                "Insanity is doing the same thing over and over again and expecting different results. - Albert Einstein",
                "Stay hungry, stay foolish. - Steve Jobs",
                "Whether you think you can or you think you can't, you're right. - Henry Ford"

        };

        System.out.print("select a quote number between 1 and 10: ");
        try {
            int selection = sc.nextInt();

            System.out.println(famousQuotes[selection - 1]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("\n[Error] Please choose a number between 1 and 10");
        }
        sc.close();


      //System.out.println(famousQuotes);

    }

}
