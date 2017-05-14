package test.java.APITests;

import main.java.API.Actions.StatusUpdateActions;
import org.testng.annotations.Test;

import java.io.IOException;

public class StatusUpdateTest {

    @Test
    public void updateStatus() throws IOException {
        StatusUpdateActions statusUpdateActions = new StatusUpdateActions();
        String body = statusUpdateActions.getResponseBody("Hello", "@andrewtechery");
        System.out.println(body);
        System.out.println(statusUpdateActions.getRequest("Hello", "@andrewtechery"));
    }
}