package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private final int defaultReturn = -1;
    private final int fullReturn = 11;
    private final int[] NUMBERS = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull()) {
            NUMBERS[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == defaultReturn;
    }

    public boolean isFull() {
        return total == fullReturn;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return defaultReturn;
        }
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck()) {
            return defaultReturn;
        }
        return NUMBERS[total--];
    }

}
