package com.sivadas.anand;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithTrue_Fail() {
    	assertFalse( false );
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }
}
