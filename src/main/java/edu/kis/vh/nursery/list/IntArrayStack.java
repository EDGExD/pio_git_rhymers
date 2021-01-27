package edu.kis.vh.nursery.list;

public class IntArrayStack implements Contener{
    
    private int[] NUMBERS = new int[12];
    
    public int total = -1;

    public void countIn(int in) {
        if (!isFull()) {
            NUMBERS[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == MinusOne;
    }

    @Override
    public boolean isFull() {
        return total == 11;
    }

    public int peekaboo() {
        if (callCheck()) {
            return Zero;
        }
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck()) {
            return Zero;
        }
        return NUMBERS[total--];
    }
}

