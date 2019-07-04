import org.junit.*;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    RegularExpression obj;
    @Before
    public void setUp(){
        obj=new RegularExpression();
    }

    @After
    public void tearDown()
    {
        obj=null;

    }

    @Test
    public void inputStringReturnTrue() {  //test case for harry
        String result = obj.findpresence("This is Harry");
        assertEquals("Is Harry here ?true", result);
    }

    @Test
    public void inputAnotherStringReturnTrue() {  //test case for henry
        String result = obj.findpresence("This is Henry");
        assertEquals("Is Harry here ?false", result);
    }

    @Test(expected = NullPointerException.class) //null pointer exception
    public void inputNullRaiseExceptions() {
        obj.findpresence(null);
    }

}