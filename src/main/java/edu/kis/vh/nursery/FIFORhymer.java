package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntArrayStack;

public class FIFORhymer extends DefaultCountingOutRhymer {

    public FIFORhymer() {
        super();
    }

    public FIFORhymer(IntArrayStack stack) {
        super(stack);
    }

    public IntArrayStack temp = new IntArrayStack();

    @Override
    public int countOut() {
        while (!callCheck()) {
            temp.push(super.countOut());
        }

        int ret = temp.pop();

        while (!temp.isEmpty()) {
            countIn(temp.pop());
        }

        return ret;
    }
}
