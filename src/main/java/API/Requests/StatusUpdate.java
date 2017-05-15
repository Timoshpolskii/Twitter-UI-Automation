package main.java.API.Requests;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface StatusUpdate {

    @POST("1.1/statuses/update.json")
    Call<ResponseBody> postStatus(@Query("status") String status, @Header("screen_name") String screen_name);
}
