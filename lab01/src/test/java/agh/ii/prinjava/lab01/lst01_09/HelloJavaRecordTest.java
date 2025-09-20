package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloJavaRecordTest {
    static int number = 5;
    static String test = "toto";
    static HelloJavaRecord rec = new HelloJavaRecord(number, test);
    static HelloJavaRecord rec2 = new HelloJavaRecord(number, test);

    @BeforeEach
    void setUp() {
        System.out.println("HelloJavaRecordTest.setUp()");
    }

    @AfterEach
    void tearDown() {
        System.out.println("HelloJavaRecordTest.tearDown()");
    }

    @Test
    void i1() {
        assertEquals(number, rec.i1());
    }

    @Test
    void s1() {
        assertEquals(test, rec.s1());
    }

    @Test
    void hashEq() {
        assertEquals(rec2.hashCode(), rec.hashCode());
        assertTrue(rec.equals(rec2));
    }
}