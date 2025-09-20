package agh.ii.prinjava.lab01.lst01_08;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
        System.out.println("Main.setUp...");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Main.tearDown...");
    }

    @Test
    void main() {
        assertEquals(false, UnsafeSingleton.getInstance() != UnsafeSingleton.getInstance());
        assertEquals(false, EagerSingleton.getInstance() != EagerSingleton.getInstance());
        assertEquals(false, LazySingleton.getInstance() != LazySingleton.getInstance());
    }
}