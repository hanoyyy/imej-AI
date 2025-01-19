package com.example.miniprojectimageai;

public class AppState {
    private static String imageName;

    public static String getImageName() {
        return imageName;
    }

    public static void setImageName(String name) {
        imageName = name;
    }
}
