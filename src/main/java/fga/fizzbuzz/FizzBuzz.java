package fga.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            System.out.println(fizzbuzz(num));
        }
    }

    static String fizzbuzz(int num) {
        if (num == 6)
            return "Fizz";

        return String.valueOf(num);
    }
}
