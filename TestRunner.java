import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestLab01.class);
        double score = 1;

        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
            score-=0.5;
            System.out.println("iteration score="+score);
        }

        if (result.wasSuccessful()) {
            System.out.println("\nEverything passed with " + score + " marks.");
        }
        else {
            System.out.println("\nYou scored " + score + " marks.");
        }
    }
}
