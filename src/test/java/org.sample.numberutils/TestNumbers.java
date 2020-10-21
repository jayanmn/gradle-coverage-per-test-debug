package org.sample.numberutils;


import org.junit.Assert;
import org.junit.Test;

public class TestNumbers {

    @Test
    public void testAdd(){
        Numbers numbers = new Numbers();
        Assert.assertEquals(22, numbers.add(10,12));
    }
}
