package com.example.miniprojectimageai;

import org.json.JSONObject;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
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
    @POST("/rotate")
    Call<RotationResponse> rotateImage(
            @Part("filename") RequestBody filename,
            @Part("degrees") RequestBody degrees
    );


    public static String getFileName(String jsonResponse) {
        try {
            // Parse the JSON response
            JSONObject jsonObject = new JSONObject(jsonResponse);

            // Extract the filename from the response
            return jsonObject.optString("filename", null); // Returns null if "filename" isn't found
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }
}
