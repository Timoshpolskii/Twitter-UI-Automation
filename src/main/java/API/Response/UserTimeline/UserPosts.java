package main.java.API.Response.UserTimeline;

public class UserPosts {
    private String created_at;
    private long id;
    private User user;

    public String getCreated_at() {
        return created_at;
    }


    public long getId() {
        return id;
    }


    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "UserPosts{" +
                "created_at='" + created_at + '\'' +
                ", id=" + id +
                ", user=" + user.toString() +
                '}';
    }
}