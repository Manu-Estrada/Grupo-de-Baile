package com.baile.grupodebaile.utils;

public class RouteFileUploadImage {
    private static String pathImageUser = "src/main/resources/static/images/user-photos/";

    public static String pathToSaveImage(String typeOfImage) {
        if(typeOfImage == "imageUser") {
            return pathImageUser;
        }
        return null;

    }
    
}
