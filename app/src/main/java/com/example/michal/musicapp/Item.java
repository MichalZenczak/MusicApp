package com.example.michal.musicapp;

/**
 * Created by michal on 3/27/18.
 */

public class Item {

    private String mItemText1;
    private String mItemText2 = null;

    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Item(String itemText1, String itemText2){
        mItemText1 = itemText1;
        mItemText2 = itemText2;
    }

    public Item(String itemText1, int imageResourceId){
        mItemText1 = itemText1;
        mImageResourceId = imageResourceId;
    }

    public Item(String itemText1, String itemText2, int imageResourceId){
        mItemText1 = itemText1;
        mItemText2 = itemText2;
        mImageResourceId = imageResourceId;
    }

    public String getItemText1(){return mItemText1;}
    public String getItemText2(){return mItemText2;}
    public int getImageResourceId(){return mImageResourceId;}
    public boolean hasImage(){return mImageResourceId != NO_IMAGE_PROVIDED;}
    public boolean isItemText2Empty(){
        if (mItemText2 != null){
            return true;
        }else{
            return false;
        }
    }

}
