package com.example.demo.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    private Duck duck = new Duck();

    @Test
    void shouldPassIfDuckSaysQuackQuack(){
        duck.talks();
        assertEquals("Quack, quack", outContent.toString());
    }

    @Test
    void shouldPassIfDuckCanSwim(){
        duck.canSwim();
        assertEquals("Duck can swim", outContent.toString());
    }
}
