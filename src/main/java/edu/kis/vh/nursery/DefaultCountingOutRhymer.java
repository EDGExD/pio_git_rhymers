package edu.kis.vh.nursery;
import edu.kis.vh.nursery.IntConteners.Contener;
import edu.kis.vh.nursery.IntConteners.IntArrayStack;

public class DefaultCountingOutRhymer {

    private Contener stack;
    
    public DefaultCountingOutRhymer() {
        this.stack = new IntArrayStack();
    }
    
    public DefaultCountingOutRhymer(Contener stack) {
        this.stack = stack;
    }
   
    public void countIn(int in) {
        stack.push(in);
    }

    public boolean callCheck() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return stack.isFull();
    }

    protected int peekaboo() {
        return stack.top();
    }

    public int countOut() {
        return stack.pop();
    }
}
