package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int TOTALDEFAULT = -1;
    private static final int TOTALFULL = 11;

    private final int[] NUMBERS = new int[12];

    public int total = TOTALDEFAULT;

    
    /** 
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    
    /** 
     * @return boolean
     */
    public boolean callCheck() {
        return total == TOTALDEFAULT;
    }

    
    /** 
     * @return boolean
     */
    public boolean isFull() {
        return total == TOTALFULL;
    }

    
    /** 
     * @return int
     */
    protected int peekaboo() {
        if (callCheck())
            return TOTALDEFAULT;
        return NUMBERS[total];
    }

    
    /** 
     * @return int
     */
    public int countOut() {
        if (callCheck())
            return TOTALDEFAULT;
        return NUMBERS[total--];
    }

    
    /** 
     * @return int
     */
    public int getTotal() {
        return total;
    }
}
