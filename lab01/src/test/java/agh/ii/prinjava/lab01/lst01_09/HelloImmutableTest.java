package agh.ii.prinjava.lab01.lst01_09;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class HelloImmutableTest {

    @BeforeEach
    void setUp() {
        System.out.println("HelloImmutable.setUp()");
    }

    @AfterEach
    void tearDown() {
        System.out.println("HelloImmutable.tearDown()");
    }

    @Test
    void getInfo() {
        int i1 = 2;
        String s1 = "toto";
        HelloImmutable tozeur = new HelloImmutable(i1, s1);
        Assertions.assertEquals(i1, tozeur.getI1());
        Assertions.assertEquals(s1, tozeur.getS1());
    }

    @Test
    void testToString() {
        int i1 = 2;
        String s1 = "toto";
        HelloImmutable tozeur = new HelloImmutable(i1, s1);
        Assertions.assertEquals("HelloImmutable{" +
                "i1=" + i1 +
                ", s1='" + s1 + '\'' +
                '}', tozeur.toString());
    }

    @Test
    void testEquals() {
        int i1 = 2;
        String s1 = "toto";
        HelloImmutable tozeur = new HelloImmutable(i1, s1);
        HelloImmutable tozeur2 = new HelloImmutable(i1, s1);
        assertTrue(tozeur.equals(tozeur2));
    }

    @Test
    void testHashCode() {
        int i1 = 2;
        String s1 = "toto";
        HelloImmutable tozeur = new HelloImmutable(i1, s1);
        HelloImmutable tozeur2 = new HelloImmutable(i1, s1);
        assertEquals(Objects.hash(tozeur),Objects.hash(tozeur2));
    }

}