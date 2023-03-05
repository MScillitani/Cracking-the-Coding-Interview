import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner bookSc = new Scanner(new File("goldilocks.txt")); //to scan goldilocks.txt file
        Scanner userSc = new Scanner(System.in); //to scan user input

        System.out.print("Which word would you like for me to count? "); //asks user for a word

        String wordToFind = userSc.nextLine(); //gets user input from scanner
        int wordCount = 0; //initialize word count to 0

        while(bookSc.hasNext()) { //scans goldilocks.txt until out of words to scan
            if (Objects.equals(bookSc.next(), wordToFind)) {
                wordCount += 1; //if the current word equals the word to find then adds 1 to the word count.
            }
        }

        System.out.println("The word '" + wordToFind + "' appears " + wordCount + " times."); //prints result
    }
}