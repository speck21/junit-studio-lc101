package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    //Needs at least 12 tests
    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void reverseBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void bracketWithNumbersReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[1,2,3]"));
    }
    //do rest in class
    @Test
    public void singleOpenBracket(){ assertFalse(BalancedBrackets.hasBalancedBrackets("["));}
    @Test
    public void inverseBracketsInWord(){assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}
    @Test
    public void singleOpenWithWord(){assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}
    @Test
    public void emptyString(){assertTrue(BalancedBrackets.hasBalancedBrackets(""));}
    @Test
    public void bracketsBeforeText(){assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));}
    @Test
    public void bracketWithinWord(){assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}
    @Test
    public void bracketAroundWord(){assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}
    @Test
    public void twoBrackets(){assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));}
    @Test
    public void inverseDoubleBrackets(){assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));}


}
