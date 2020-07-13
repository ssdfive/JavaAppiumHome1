import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

    public void testGetClassNumber() {

        System.out.println("firstTest");
        int a = 45;
        int b = this.getClassNumber();
        Assert.assertTrue("getClassNumber  из MainClass  возвращает число меньше 45", a <= b);


    }


}


