package com.example.demo.entities;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParrotTests {
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

    private Parrot parrot = new Parrot();

    @Test
    void shouldPassIfParrotRoomiesAreDogsAndPrintTalkMessage(){
        parrot.setRoomie("dogs");
        assertEquals("dogs", parrot.getRoomies());
        parrot.talks();
        assertEquals("Woof, woof", outContent.toString());
    }

    @Test
    void shouldPassIfParrotRoomiesAreCatsAndPrintTalkMessage(){
        parrot.setRoomie("cats");
        assertEquals("cats", parrot.getRoomies());
        parrot.talks();
        assertEquals("Meow", outContent.toString());
    }

    @Test
    void shouldPassIfParrotRoomiesAreRoosterAndPrintTalkMessage(){
        parrot.setRoomie("rooster");
        assertEquals("rooster", parrot.getRoomies());
        parrot.talks();
        assertEquals("Cock-a-doodle-doo", outContent.toString());
    }
}
