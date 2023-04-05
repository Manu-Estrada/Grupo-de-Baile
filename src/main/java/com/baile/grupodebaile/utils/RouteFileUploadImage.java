package com.baile.grupodebaile.utils;

public class RouteFileUploadImage {
    private static String pathImageUser = "src/main/resources/static/images/user-photos/";
    private static String pathImageEvent = "src/main/resources/static/images/event-photos/";

    public static String pathToSaveImage(String typeOfImage) {
        if (typeOfImage == "imageUser") {
            return pathImageUser;
        }

        if (typeOfImage == "imageEvent") {
            return pathImageEvent;
        }
        return null;
    }
}
