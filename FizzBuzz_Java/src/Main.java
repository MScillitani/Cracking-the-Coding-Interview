public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            String r = (i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : (i % 3 == 0) ? "Fizz" : (i % 5 == 0) ? "Buzz" : String.valueOf(i);
            System.out.println(r);
        }
    }
}