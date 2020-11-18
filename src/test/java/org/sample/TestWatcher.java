package org.sample;

import com.nordstrom.automation.junit.AtomicTest;
import com.nordstrom.automation.junit.RunWatcher;
import org.junit.internal.AssumptionViolatedException;

public class TestWatcher implements RunWatcher {
    @Override
    public void testStarted(AtomicTest atomicTest) {
        System.out.println("Started " + atomicTest.toString());
    }

    @Override
    public void testFinished(AtomicTest atomicTest) {
        System.out.println("finished " + atomicTest.toString());
    }

    @Override
    public void testFailure(AtomicTest atomicTest, Throwable thrown) {

    }

    @Override
    public void testAssumptionFailure(AtomicTest atomicTest, AssumptionViolatedException thrown) {

    }

    @Override
    public void testIgnored(AtomicTest atomicTest) {

    }

    @Override
    public Class supportedType() {
        return ;
    }
}
