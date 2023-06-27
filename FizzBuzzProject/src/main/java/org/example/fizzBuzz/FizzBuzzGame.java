package org.example.fizzBuzz;

public class FizzBuzzGame {
        public void play() {
            for (int i = 1; i <= 100; i++) {
                System.out.println(getFizzBuzz(i));
            }
        }

        public String getFizzBuzz(int number) {
            if (isDivisibleBy3OrContains3(number) && isDivisibleBy5OrContains5(number)) {
                return "FizzBuzz";
            }if (isDivisibleBy3OrContains3(number)) {
                return "Fizz";
            }if (isDivisibleBy5OrContains5(number)) {
                return "Buzz";
            }
            return Integer.toString(number);
        }

        private boolean isDivisibleBy3OrContains3(int number) {
            return number % 3 == 0 || containsDigit(number, 3);
        }

        private boolean isDivisibleBy5OrContains5(int number) {
            return number % 5 == 0 || containsDigit(number, 5);
        }

        private boolean containsDigit(int number, int digit) {
            return Integer.toString(number).contains(Integer.toString(digit));
        }
}
