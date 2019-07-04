import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose obj;

    @Before
    public void setUp()
    {
        obj=new Transpose();
    }

    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenStringReturnTranspose()  //test case for reversing
        {
        String result=obj.reverseString("a quick brown fox jumps over the lazy dog");
        assertEquals(result,"a kciuq nworb xof spmuj revo eht yzal god");
    }

    @Test
    public void givenEmptyStirng() //test case for empty string
    {
        String result=obj.reverseString("");
        assertEquals(result,"Error:Empty String");
    }

    @Test(expected = NullPointerException.class) //test case for null pointer exception
    public void givenNullShouldRaiseException()
    {
      obj.reverseString(null);
    }

}