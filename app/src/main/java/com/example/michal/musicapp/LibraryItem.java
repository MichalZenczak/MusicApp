package com.example.michal.musicapp;



/**
 * Created by michal on 3/23/18.
 */

public class LibraryItem {

    private int mItemTextResourceId;
    private int mItemImageResourceId;


    public LibraryItem(int itemTextResourceId, int itemImageResourceId){
        mItemTextResourceId = itemTextResourceId;
        mItemImageResourceId = itemImageResourceId;

    }

    public int getItemTextResourceId(){return mItemTextResourceId;}
    public int getItemImageResourceId(){return mItemImageResourceId;}

}
