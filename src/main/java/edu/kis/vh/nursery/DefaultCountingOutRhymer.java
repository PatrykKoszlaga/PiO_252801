package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TOTALDEFAULT = -1;
    private static final int TOTALFULL = 11;

    private int[] NUMBERS = new int[12];

    public int total = TOTALDEFAULT;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == TOTALDEFAULT
;
    }

    public boolean isFull() {
        return total == TOTALFULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return TOTALDEFAULT
    ;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return TOTALDEFAULT
    ;
        return NUMBERS[total--];
    }

}
