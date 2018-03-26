package com.example.michal.musicapp;


public class LibraryListItem {

    private int mItemTextResourceId;
    private int mItemImageResourceId;

    //Constructor
    public LibraryListItem(int itemTextResourceId, int itemImageResourceId){
        mItemTextResourceId = itemTextResourceId;
        mItemImageResourceId = itemImageResourceId;

    }

    public int getItemTextResourceId(){return mItemTextResourceId;}
    public int getItemImageResourceId(){return mItemImageResourceId;}

}
