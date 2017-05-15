package main.java.API.Requests;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;


public interface UserTimeline {
    @GET("1.1/statuses/user_timeline.json")
    Call<ResponseBody> getUserPosts(@Header("screen_name") String header);
}