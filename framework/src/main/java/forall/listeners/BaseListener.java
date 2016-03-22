package forall.listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by oljashabanova on 18/03/16.
 */
public class BaseListener extends TestListenerAdapter {

    public void onTestFailure(ITestResult result) {
        //take screenshot
    }

    public void onTestSkipped(final ITestResult result) {
        result.setStatus(ITestResult.FAILURE);
        result.setThrowable(result.getThrowable());
    }


}

