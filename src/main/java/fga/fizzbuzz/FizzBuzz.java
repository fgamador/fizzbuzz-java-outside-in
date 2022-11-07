package fga.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            System.out.println(fizzbuzz(num));
        }
    }

    private static String fizzbuzz(int num) {
        return String.valueOf(num);
    }
}
