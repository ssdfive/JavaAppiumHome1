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


    public void testGetLocalNumber() {

        System.out.println("firstTest");
        int a = 14;
        int b = this.getLocalNumer();
        Assert.assertTrue("getLocalNumber  из MainClass не возвращает 14", a == b);


    }
}
