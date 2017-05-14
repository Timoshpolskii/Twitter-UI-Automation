package main.java.API.Response.UserTimeline;

public class User {
    private String name;
    private String screen_name;
    private long id;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScreen_name() {
        return screen_name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", screen_name='" + screen_name + '\'' +
                ", id=" + id +
                '}';
    }
}
