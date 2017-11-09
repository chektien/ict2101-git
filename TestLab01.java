import java.io.File;
import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Assert;
import junitx.framework.FileAssert;

public class TestLab01 {
    File a = new File("input.txt");
    File b = new File("output.txt");

    @BeforeClass
    public static void init() {
        // new comment
        // user 1s comment
        System.out.println("START Grading TestLab01...\n(only failed tests are shown)\n");
    }

    @AfterClass
    public static void teardown() {
        System.out.println("FINISHED testing, results below:\n");
    }

    @Test
    public void test1_file() {
        FileAssert.assertEquals("-0.5 marks for file test.", a, b);
    }

    @Test
    public void test2_msg() {
        String msg1 = "The test message";
        String msg2 = "The expected message";
        Assert.assertEquals("-0.5 marks for messaging test.", msg1, msg2);
    }
}
