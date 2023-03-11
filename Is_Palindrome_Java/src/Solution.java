public class Solution {
    public static boolean isPalindrome(int x) {
        String number = String.valueOf(x);
        char[] digits = number.toCharArray();
        int j = digits.length-1;
        int counter = 0;
        for (int i = 0; i<digits.length; i++) {
            System.out.println(digits[i] + " " + digits[j]);
            if (digits[i] == digits[j]) {
                counter++;
            }
            j--;
        }
        if (counter == digits.length) {
            return true;
        }
        return false;
    }
}
