import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort obj;
    @Before
    public void setUp(){
        obj= new Sort();
    }

    @After
    public void tearDown(){
        obj=null;
    }

    @Test
    public void TestShouldReturnWordsInOrder(){//test case for sorting
        String[] expected={"Alpha","Beta","Gamma"};
        String[] actual=obj.sort("Gamma Alpha Beta");
        assertArrayEquals(expected,actual);
    }

    @Test
    public void TestShouldReturnErrorMessage(){//test case for empty string
        String[] expected = {"Error Empty String"};
        String[] actual = obj.sort("");
        assertArrayEquals(expected,actual);

    }

    @Test(expected = NullPointerException.class)//Test case for Null
    public void TestShouldReturnNullException(){
        obj.sort(null);

    }


}