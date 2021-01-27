package edu.kis.vh.nursery;

class IntArrayStack{
    
    private int[] NUMBERS = new int[12];
    
    public int total = -1;

    public void countIn(int in) {
        if (!isFull()) {
            NUMBERS[++total] = in;
        }
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck()) {
            return -1;
        }
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck()) {
            return -1;
        }
        return NUMBERS[total--];
    }
}

public class DefaultCountingOutRhymer {

    private IntArrayStack stack;
    
    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }
    
    public DefaultCountingOutRhymer(IntArrayStack stack) {
        this.stack = stack;
    }
   
    public void countIn(int in) {
        stack.countIn(in);
    }

    public boolean callCheck() {
        return stack.callCheck();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    protected int peekaboo() {
        return stack.peekaboo();
    }

    public int countOut() {
        return stack.countOut();
    }
}
