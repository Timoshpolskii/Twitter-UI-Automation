package main.java.API.Actions;

import java.io.IOException;

public interface BaseActions {
     String getRequest(String status, String screen_name);
     String getResponseBody(String status, String screen_name) throws IOException;
     String getRequest(String screen_name);
     String getResponseBody(String screen_name) throws IOException;
}