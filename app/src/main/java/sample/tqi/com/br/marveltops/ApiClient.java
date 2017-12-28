package sample.tqi.com.br.marveltops;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by katia.goncalves on 27/12/2017.
 */

public class ApiClient {
    public static final String BASE_URL="https://gateway.marvel.com:443/v1/public/comics?apikey=f1ca05aa95ee8714ef7d3572f4e1d087";

    public static Retrofit retrofit = null;

    public static Retrofit getApiClient(){
        if(retrofit==null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory( GsonConverterFactory.create()).build() ;
        }

        return retrofit;
    }

}
