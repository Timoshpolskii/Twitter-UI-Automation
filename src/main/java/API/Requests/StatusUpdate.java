package main.java.API.Requests;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface StatusUpdate {

    @Headers({
            "Authorization: OAuth oauth_consumer_key=\"z7tNU6PYcciYUrnsXXXRapDqM\"," +
                    "oauth_token=\"3390666947-cfbg4q7A13ip5tPqtXBd6bZ48FWsSzpgPgrtzee\"," +
                    "oauth_signature_method=\"HMAC-SHA1\"," +
                    "oauth_timestamp=\"1494687890\"," +
                    "oauth_nonce=\"ThdHFv\"," +
                    "oauth_version=\"1.0\"," +
                    "oauth_signature=\"uzVFRkna%2BRBIlFRXuVDxdjnNTrY%3D\""})
    @POST("1.1/statuses/update.json")
    Call<ResponseBody> postStatus(@Query("status") String status, @Header("screen_name") String screen_name);
}
