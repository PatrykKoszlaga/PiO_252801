package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.RhymersFactory;

/*
Testy działają poprawnie
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running edu.kis.vh.nursery.RhymersJUnitTest
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.067 s -- in edu.kis.vh.nursery.RhymersJUnitTest

Results:

Tests run: 5, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  3.043 s
Finished at: 2025-04-02T11:04:20+02:00
------------------------------------------------------------------------
*/

class RhymersDemo {

    public static void main(String[] args) {
        RhymersFactory factory = new DefaultRhymersFactory();
        
        testRhymers(factory);
        
    }

    private static void testRhymers(RhymersFactory factory) {
        DefaultCountingOutRhymer[] rhymers = {factory.getStandardRhymer(), factory.getFalseRhymer(),
            factory.getFIFORhymer(), factory.getHanoiRhymer()};
        
        test1(rhymers);
        
        test2(rhymers);
        
        test3(rhymers);
        
        test4(rhymers);
    }

    private static void test1(DefaultCountingOutRhymer[] rhymers) {
        for (int i = 1; i < 15; i++)
            for (int j = 0; j < 3; j++)
                rhymers[j].countIn(i);
    }

    private static void test2(DefaultCountingOutRhymer[] rhymers) {
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < 15; i++)
            rhymers[3].countIn(rn.nextInt(20));
    }

    private static void test3(DefaultCountingOutRhymer[] rhymers) {
        for (DefaultCountingOutRhymer rhymer : rhymers) {
            while (!rhymer.callCheck()) {
                System.out.print(rhymer.countOut() + "  ");
            }
            System.out.println();
        }
    }

    private static void test4(DefaultCountingOutRhymer[] rhymers) {
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[3]).reportRejected());
    }
    
}