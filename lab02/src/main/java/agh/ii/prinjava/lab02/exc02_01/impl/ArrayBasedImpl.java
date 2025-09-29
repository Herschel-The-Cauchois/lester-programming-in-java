package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {

    @Override
    public int pop() {
        int value = peek();
        int[] newArray = new int[numOfElems-1];
        for  (int i = 0; i < numOfElems-1; i++) {
            newArray[i] = stack[i];
        }
        stack = newArray;
        numOfElems--;
        return value;
    }

    @Override
    public void push(int x) {
        if (numOfElems < 10) {
            stack[numOfElems] = x;
            numOfElems++;
        } else {
            System.out.println("Stack overflow, resizing.");
            int[] newStack = new int[numOfElems+1];
            for  (int i = 0; i < numOfElems; i++) {
                newStack[i] = stack[i];
            }
            newStack[numOfElems] = x;
            stack = newStack;
            numOfElems++;
        }
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        return stack[numOfElems-1];
    }

    private int numOfElems = 0;
    private int stack[] = new int[10];
    private int phySize = 10;
}
