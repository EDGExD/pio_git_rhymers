package edu.kis.vh.nursery;
import edu.kis.vh.nursery.list.IntArrayStack;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    public HanoiRhymer() {
        super();
    }

    public HanoiRhymer(IntArrayStack stack) {
        super(stack);
    }

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo()) {
            totalRejected++;
        } else {
            super.countIn(in);
        }
    }
}
