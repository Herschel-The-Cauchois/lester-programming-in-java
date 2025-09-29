package agh.ii.prinjava.lab02.exc02_01;

/**
 * <p>Stack of integers - Abstract Data Type (ADT)</p>
 *
 * <p>Goal : implement the Stack data structure via an interface, this is the interface contract to implement.
 * It is still abstract for the moment.</p>
 * @since 1.0
 */

public interface StackOfInts {
    /**
     * <p>Method to <b>pop</b> out of the stack the top element.</p>
     *
     * @param : only self object.
     * @return : the value of the top element of the stack.
     * @since : 1.0
     * */
    int pop();

    /**
     * <p>Method to <b>push</b> a new number at the top of the stack.</p>
     *
     * @param : x, new int to be added to the stack.
     * @return : nothing.
     * @since : 1.0.
     * */
    void push(int x);

    /**
     * <p>Method to check if the stack <b>is empty</b>. Already implemented here, because we just need to check the number of elements.</p>
     *
     * @param : nothing.
     * @return : True or False following if the number of elements is 0.
     * @since : 1.0.
     * */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * <p>Method to return the <b>number of elements</b>.</p>
     *
     * @param : nothing.
     * @return : numOfElems, number of elements.
     * @since : 1.0.
     * */
    int numOfElems();

    /**
     * <p>Method to <b>peek</b> at the value at the top of the stack.</p>
     *
     * @param : nothing.
     * @return : peek, the value of the top element.
     * @since : 1.0.
     * */
    int peek();
}
