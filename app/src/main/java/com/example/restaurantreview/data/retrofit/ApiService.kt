package com.example.restaurantreview.data.retrofit
import com.example.restaurantreview.data.response.PostReviewResponse
import com.example.restaurantreview.data.response.ResponseRestaurant
import retrofit2.Call
import retrofit2.http.*

interface ApiService {
    @GET("detail/{id}")
    fun getRestaurant(
        @Path("id") id: String
    ): Call<ResponseRestaurant>

    @FormUrlEncoded
    @Headers("Authorization: token 12345")
    @POST("review")
    fun postReview(
        @Field("id") id: String,
        @Field("name") name: String,
        @Field("review") review: String
    ): Call<PostReviewResponse>
}
