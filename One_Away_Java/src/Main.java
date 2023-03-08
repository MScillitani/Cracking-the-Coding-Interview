import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userString1 = sc.nextLine();
        System.out.println("And another string: ");
        String userString2 = sc.nextLine();

        char[] charSet1 = new char[userString1.length()];
        char[] charSet2 = new char[userString2.length()];

        if (charSet1.length != charSet2.length) {
            System.out.println("Strings must be of equal length");
            System.exit(-1);
        }

        int commons = 0;
        for (int i = 0; i < charSet1.length; i++) {
            charSet1[i] = userString1.charAt(i);
            charSet2[i] = userString2.charAt(i);
            System.out.println(charSet1[i] + " " + charSet2[i]);
            if (charSet1[i] == charSet2[i]) {
                System.out.println(" yes");
                commons += 1;
            }
        }

        if (commons == charSet1.length - 1) {
            System.out.println("The entered strings are one edit away");
        } else if (commons == charSet1.length){
            System.out.println("The entered strings are zero edits away");
        } else {
            System.out.println("The entered strings are more than one edit away");
        }
    }
}