package com.example.muhammad.miwok;

import android.content.Context;

/**
 * Created by Muhammad on 29/09/2016.
 */
public class Word {

    /* Default translatio of the word*/
    private String mDefaultTranslation;
    /* Miwok translation of the word*/
    private String mMiwokTranslation;
    /*Image resource Id*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;

    /* constructor with two  arguments*/
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /* constructor with three arguments*/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /* method to get the default translatio of the word*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /* method to get the miwok translation of the word*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /* method to get the image resource Id*/
    public int getImageResourceId(){return mImageResourceId; }

    public boolean hadImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    //return the audio resource id
    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
