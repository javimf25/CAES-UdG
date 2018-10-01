package edu.udg.caes;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testSayHello(){
        Hello hello = new Hello();
        final String result = hello.Say();
        assertEquals(result, "Hello World!");
    }
}
