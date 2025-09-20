package agh.ii.prinjava.lab01.lst01_03;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @BeforeEach
    void setUp() {
        System.out.println("ShapeTest.setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("ShapeTest.tearDown");
    }

    @Test
    void area() {
        Rectangle testrec = new Rectangle(2, 2, true);
        assertEquals(4, testrec.area());
        Circle testcirc = new Circle(3, true);
        assertEquals(3 * 3 * Math.PI , testcirc.area());
    }

    @Test
    void perimeter() {
        Rectangle testrec = new Rectangle(2, 2, true);
        assertEquals(8, testrec.perimeter());
        Circle testcirc = new Circle(3, true);
        assertEquals(3 * 2 * Math.PI , testcirc.perimeter());
    }

    @Test
    void isFilled() {
        Rectangle testrec = new Rectangle(2, 2, true);
        assertEquals(true, testrec.isFilled());
        Circle testcirc = new Circle(3, false);
        assertEquals(false , testcirc.isFilled());
    }

    @Test
    void setFilled() {
        Rectangle testrec = new Rectangle(2, 2, false);
        testrec.setFilled(true);
        assertEquals(true, testrec.isFilled());
        Circle testcirc = new Circle(3, true);
        testcirc.setFilled(false);
        assertEquals(false , testcirc.isFilled());
    }
}