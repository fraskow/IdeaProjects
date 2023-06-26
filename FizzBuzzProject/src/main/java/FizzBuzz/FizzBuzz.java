package FizzBuzz;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    public static String getFizzBuzz(int number) {
        if (isDivisibleBy3OrContains3(number) && isDivisibleBy5OrContains5(number)) {
            return "FizzBuzz";
        } else if (isDivisibleBy3OrContains3(number)) {
            return "Fizz";
        } else if (isDivisibleBy5OrContains5(number)) {
            return "Buzz";
        } else {
            return Integer.toString(number);
        }
    }

    public static boolean isDivisibleBy3OrContains3(int number) {
        return number % 3 == 0 || Integer.toString(number).contains("3");
    }

    public static boolean isDivisibleBy5OrContains5(int number) {
        return number % 5 == 0 || Integer.toString(number).contains("5");
    }

}
