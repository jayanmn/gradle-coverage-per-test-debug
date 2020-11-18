package org.sample.numberutils;


import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public class TestNumbers2 extends TestCase {


    public void testAddInJunit3(){

        Numbers numbers = new Numbers();
        Assert.assertEquals(25, numbers.add(10,12));
    }
}
