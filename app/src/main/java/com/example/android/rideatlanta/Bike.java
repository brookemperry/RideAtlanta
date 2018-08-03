package com.example.android.rideatlanta;

import android.net.Uri;

public class Bike {
    //name of the location or group
    private String mName;

    //address of the location or group
    private String mAddress;

    //website of the location or group
    private String mWebsite;

    //not all arraylists will use an image
    private int mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = 0;

   public Bike(String name, String address, String website){
       mName = name;
       mAddress = address;
       mWebsite = website;
   }

   public Bike(String name, String address, String website, int imageId){
       mName = name;
       mAddress = address;
       mWebsite = website;
       mImageId = imageId;
   }

   //get name of location or group
    public String getmName() {
        return mName;
    }

    //Get address of location or group
    public String getmAddress() {
        return mAddress;
    }

    //Get website of location or group
    public String getmWebsite() {
        return mWebsite;
    }

    //Get image associated with location or group
    public int getmImageId() {
        return mImageId;
    }

    //Returns whether there is an image or not associated with location or group
    public boolean hasImage(){
       return mImageId !=NO_IMAGE_PROVIDED;
    }
}
