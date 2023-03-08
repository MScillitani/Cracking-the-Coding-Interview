import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a string: "); // prompt user for a String
        Scanner sc = new Scanner(System.in); // scanner
        String userString = sc.nextLine(); // stores user input

        String result = isUnique(userString) ? "is" : "is not"; // sets result from isUnique method

        System.out.println("The entered string " + result + " unique"); //displays result
    }

    private static boolean isUnique(String str) {

        if (str.length() > 128) // if more chars than uniquely possible, returns false
            return false;

        char[] cs1 = new char[str.length()]; // first character set
        char[] cs2 = new char[str.length()]; // second character set to compare to first
        for(int i = 0; i < str.length(); i++) { // loops through all chars
            cs1[i] = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) { // loops through all chars + 1 and compares to set of all chars
                cs2[j] = str.charAt(j);
                System.out.println(cs1[i] + " " + cs2[j]); // displays comparisons
                if(cs1[i] == cs2[j]) {
                    return false;
                }
            }
        }
        return true; // returns true if looped through all possibilities without match
    }
}