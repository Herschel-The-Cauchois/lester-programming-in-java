package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LinkedListBasedImplTest {

    // Create an empty stack
    private final StackOfInts stackOfInts = StackOfIntsFtry.create(StackOfIntsFtry.Impln.L_LIST_B);

    @BeforeEach
    void setUp() {
        System.out.println("LinkedListBasedImplTest.setUp()");
    }

    @AfterEach
    void tearDown() {
        System.out.println("LinkedListBasedImplTest.tearDown()");
    }

    @Test
    void newStackIsEmpty() {
        assertTrue(stackOfInts.isEmpty());
    }

    @Test
    void push() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        Assertions.assertEquals(3, stackOfInts.peek());
    }

    @Test
    void pop() {
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.pop();
        Assertions.assertEquals(2, stackOfInts.peek());
        Assertions.assertEquals(2, stackOfInts.pop());
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