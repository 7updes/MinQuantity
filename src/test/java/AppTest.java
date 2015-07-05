import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Alex on 05.07.2015.
 */
public class AppTest {

    @Test
    public void testPrintMinQuantity1(){
        assertEquals(App.printMinQuantity(4), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintMinQuantity2(){
        App.printMinQuantity(-1);
    }
    @Test
    public void testMin(){
        assertEquals(App.min(51, 122), 51);
    }

    @Test
    public void testIsPrime(){
        assertTrue(App.isPrime(11));
    }

    @Test
    public void testIsPrime1(){
        assertFalse(App.isPrime(21));
    }
}