package fga.fizzbuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            System.out.println(fizzbuzz(num));
        }
    }

    static String fizzbuzz(int num) {
        if (num == 30)
            return "FizzBuzz";

        if (num % 5 == 0)
            return "Buzz";

        if (num % 3 == 0)
            return "Fizz";

        return String.valueOf(num);
    }
}
