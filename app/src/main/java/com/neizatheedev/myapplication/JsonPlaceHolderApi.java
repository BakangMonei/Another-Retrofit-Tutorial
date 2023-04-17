package com.neizatheedev.myapplication;


import com.neizatheedev.myapplication.Beans.Comment;
import com.neizatheedev.myapplication.Beans.Post;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {
    @GET("posts")
    Call<List<Post>> getPosts(@Query("userID") int user);

    @GET("posts/{id}/comments")
    Call<List<Comment>> getComment(@Path("id") int postId);
}