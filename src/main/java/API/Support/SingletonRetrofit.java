package main.java.API.Support;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SingletonRetrofit {

    private static Retrofit retrofit = null;

    private SingletonRetrofit(){}

    public static  synchronized Retrofit getRetrofit() {

        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://api.twitter.com/")
                    .build();
        }
        return retrofit;
    }
}