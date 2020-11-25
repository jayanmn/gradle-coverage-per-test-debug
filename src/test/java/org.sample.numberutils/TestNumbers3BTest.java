package org.sample.numberutils;


import junit.framework.TestCase;
import org.junit.Assert;


public class TestNumbers3BTest extends TestCase {

    @Override
    protected void setUp() throws Exception {
        System.setProperty("jacoco-agent.destfile",getName()+".exe");
    }

    public void testAddInJunit3(){

        Numbers numbers = new Numbers();
        Assert.assertEquals(25, numbers.add(10,12));
    }
}
