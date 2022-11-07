package fga.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void ordinaryNumberPrintsAsItself() {
        assertEquals("2", FizzBuzz.fizzbuzz(2));
    }
}
