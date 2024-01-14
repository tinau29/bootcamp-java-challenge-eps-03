package com.example;

//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

//        assertTrue( true );
        App app = new App();
        assertEquals("Hello world", app.sayHello());
    }
}
