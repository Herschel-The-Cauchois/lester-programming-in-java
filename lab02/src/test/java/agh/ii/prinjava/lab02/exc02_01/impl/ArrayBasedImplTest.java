package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.ARRAY_B);

    @BeforeEach
    void setUp() {
        System.out.println("ArrayBasedImplTest setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("ArrayBasedImplTest tearDown");
    }

    @Test
    void newStackIsEmpty() {
        assertTrue(stackOfInts.isEmpty());
    }

    @Test
    void pop() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.push(4);
        stackOfInts.push(5);
        stackOfInts.push(6);
        stackOfInts.push(7);
        stackOfInts.push(8);
        stackOfInts.push(9);
        stackOfInts.push(10);
        Assertions.assertDoesNotThrow(() -> stackOfInts.push(11));
        stackOfInts.push(12);
        Assertions.assertEquals(12,stackOfInts.pop());
        stackOfInts.pop();
    }

    @Test
    void push() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        Assertions.assertEquals(3, stackOfInts.peek());
        stackOfInts.push(4);
        stackOfInts.push(5);
        stackOfInts.push(6);
        stackOfInts.push(7);
        stackOfInts.push(8);
        stackOfInts.push(9);
        stackOfInts.push(10);
        Assertions.assertDoesNotThrow(() -> stackOfInts.push(11));
        Assertions.assertEquals(11,stackOfInts.numOfElems());
    }

    @Test
    void numOfElems() {
        stackOfInts.push(1);
        Assertions.assertEquals(1, stackOfInts.numOfElems());
    }

    @Test
    void peek() {
        stackOfInts.push(1);
        Assertions.assertEquals(1, stackOfInts.peek());
    }
}