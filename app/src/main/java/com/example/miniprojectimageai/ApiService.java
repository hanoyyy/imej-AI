package com.example.miniprojectimageai;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @Multipart
    @POST("upload_image")
    Call<ResponseBody> uploadImage(@Part MultipartBody.Part image);

    @Multipart
    @POST("/process/histogram")
    Call<ResponseBody> processHistogram(@Part MultipartBody.Part image);

    @Multipart
    @POST("/process/contrast")
    Call<ResponseBody> processContrast(@Part MultipartBody.Part image);

    @Multipart
    @POST("/process/gamma")
    Call<ResponseBody> processGamma(@Part MultipartBody.Part image);
}