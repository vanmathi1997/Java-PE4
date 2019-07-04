import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;

public class CountOccurrenceTest {

   CountOccurrence obj;

    @Before
    public void setUp(){
        obj = new CountOccurrence();
    }

    @After
    public void tearDown() {
        obj = null;
    }

    @Test
    public void inputStringCharacterReturnsCount() { //checks whether the given characters occurs for the expected number of times in the inputString
        int result = obj.countOccurence("hello hi how happy you are",'h',0,0);
        assertEquals(4,result);
    }

    @Test
    public void inputStringCharacterReturnNotFound() { //test case for character not present in the string
        int result = obj.countOccurence("Welcome ",'g',0,0);
        assertEquals(0,result);
    }

    @Test
    public void inputStringCharacterReturnCount1() { //test case for assert not equals
        int result =obj.countOccurence("HEIGHTHEIGHTHH",'h',0,0);
        assertNotEquals(1,result);
    }

    @Test(expected = NullPointerException.class) //Null Pointer Exception test case
    public void inputNullReturnException(){

        obj.countOccurence(null,'g',0,0);
    }

}