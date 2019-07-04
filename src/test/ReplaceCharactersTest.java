import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
    ReplaceCharacters obj;

    @Before
    public void setUp() {
        obj = new ReplaceCharacters();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void inputStringReturnReplacedString() { //checks whether the expected result matches the actual result
        String result = obj.replaceCharacters("daily dry");
        String expected = "faity fry";
        assertEquals(expected,result);
    }

    @Test(expected = NullPointerException.class) //test case for null pointer exception
    public void inputNullReturnException() {
        obj.replaceCharacters(null);
    }

    @Test
    public void inputStringReturnNull(){ //empty string test case
        String result = obj.replaceCharacters("");
        assertNull(result);
    }

}

