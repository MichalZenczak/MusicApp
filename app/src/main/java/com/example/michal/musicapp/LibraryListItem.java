package com.example.michal.musicapp;

/**
 * Represents a single item in a list that displays two features: text and image.
 */
public class LibraryListItem {

    private int mItemTextResourceId;
    private int mItemImageResourceId;

    /**
     * Constructor
     * Create a new LibraryListItem object
     * @param itemTextResourceId the text resource ID
     * @param itemImageResourceId the image resource ID
     */
    public LibraryListItem(int itemTextResourceId, int itemImageResourceId){
        mItemTextResourceId = itemTextResourceId;
        mItemImageResourceId = itemImageResourceId;

    }

    /**
     * @return the text resource ID
     */
    public int getItemTextResourceId(){return mItemTextResourceId;}

    /**
     * @return the image resource ID
     */
    public int getItemImageResourceId(){return mItemImageResourceId;}

}
