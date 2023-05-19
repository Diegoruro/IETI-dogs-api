package org.adaschool.retrofit.network;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogApiService {
    @GET("api/breeds/list/all")
    Call<BreedsListDto> getAllBreeds();
}