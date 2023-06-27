package org.example.fizzBuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzGameTest {

    @Test
    void getFizzBuzzTest() {
        FizzBuzzGame game = new FizzBuzzGame();
        assertEquals("Fizz", game.getFizzBuzz(3));
        assertEquals("Buzz", game.getFizzBuzz(5));
        assertEquals("FizzBuzz", game.getFizzBuzz(15));
        assertEquals("7", game.getFizzBuzz(7));
    }
}