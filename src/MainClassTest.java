import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainClassTest extends MainClass {
    @Before
    public void textStartedTest() {
        System.out.println("Start test");
    }

    @After
    public void testFinishTest() {
        System.out.println("Finish test");
    }

    @Test

    public void testGetClassString() {


        String a = getClassString();

        Assert.assertTrue("Строка class_string в MainClass не содержит подстроку Hello/hello ",a.toLowerCase().contains("hello"));



    }


}



