import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurrenceTest {

        MultipleOccurrence obj;

        @Before
        public void setUp() {
           obj= new MultipleOccurrence();
        }

        @After
        public void tearDown() {
            obj = null;
        }

        @Test
        public void inputStringReturnIndexString() { //test case for
            String result[] = obj.stringOccurence("She sells seashells by the seashore","se");
            String expected[] = {"4 - 6","10 - 12","27 - 29"};
            assertArrayEquals(expected,result);
        }

        @Test(expected = NullPointerException.class) //test case for two null
        public void inputNullReturnException() {
            String result[] = obj.stringOccurence(null,null);
        }

        @Test(expected = NullPointerException.class) //test case for one null
        public void inputNullSubstringReturnException() {
            obj.stringOccurence("Hello there", null);
        }

        @Test
        public void inputStringReturnIndex(){ //test case for space
            String result[] = obj.stringOccurence("hello world"," ");
            String expected[] = {"5 - 6"};
            assertArrayEquals(expected,result);
        }
    }

