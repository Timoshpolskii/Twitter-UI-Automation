package test.java.APITests;

import main.java.API.Actions.UserTimelineActions;
import okhttp3.ResponseBody;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserTimelineTest {

    @Test
    public void userTimelineTest() throws IOException {
        UserTimelineActions userTimelineActions = new UserTimelineActions();
        String response = userTimelineActions.getResponseBody("@andrewtechery");

        System.out.println(userTimelineActions.getRequest("@andrewtechery"));
        System.out.println(response);
    }
}