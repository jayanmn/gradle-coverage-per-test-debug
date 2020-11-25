package org.sample.numberutils;


import org.junit.Assert;
import org.junit.Test;

public class TestNumbers9 {

    @Test
    public void testAdd(){
        System.out.println("pid of test process" +java.lang.management.ManagementFactory.getRuntimeMXBean().getName());

        Numbers numbers = new Numbers();
        Assert.assertEquals(22, numbers.add(10,12));
    }
}
