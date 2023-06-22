package test;

import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void bracketsTest1 () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void bracketsTest2() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void bracketsTest3 () {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public void bracketsTest4 () {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void bracketsTest5 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
}
    @Test
    public void bracketsTest6 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void bracketsTest7 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketsTest8 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void bracketsTest9 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void bracketsTest10 () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

