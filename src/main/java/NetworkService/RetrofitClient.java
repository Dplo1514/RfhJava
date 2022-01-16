package NetworkService;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static final String Base_url = "https://reqres.in/";

    public static RetrofitService getApi(){
        return getInstance().create(RetrofitService.class);
    }

    private static Retrofit getInstance() {
        Gson gson = new GsonBuilder().setLenient().create();
        return new Retrofit.Builder().baseUrl(Base_url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

    }
}
