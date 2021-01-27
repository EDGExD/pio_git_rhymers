package edu.kis.vh.nursery.IntConteners;

public class IntArrayStack implements Contener{
    
    private int[] NUMBERS = new int[12];
    
    public int total = -1;

    @Override
    public void push(int in) {
        if (!isFull()) {
            NUMBERS[++total] = in;
        }
    }

    @Override
    public boolean isEmpty() {
        return total == MinusOne;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    @Override
    public int top() {
        if (isEmpty()) {
            return Zero;
        }
        return NUMBERS[total];
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            return Zero;
        }
        return NUMBERS[total--];
    }
}

