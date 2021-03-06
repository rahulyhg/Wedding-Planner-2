package com.example.stefani.weddingplanner;

/**
 * Created by Stefani on 05/12/2017.
 */

public class GuestClass {
    private String mID;
    private String mFullName;
    private String mPhone;
    private int mNumOfGuest = 1;
    private boolean mIsComing = false;
    private String mSide;
    private String mBelongingGroup;

    public GuestClass(String id, String fullName, String phone, int mNumOfGuest, String side, String belongingGroup) {
        this.mID = id;
        this.mFullName = fullName;
        this.mPhone = phone;
        this.mNumOfGuest = mNumOfGuest;
        this.mIsComing = false;
        this.mSide = side;
        this.mBelongingGroup = belongingGroup;
    }

    public GuestClass(){}

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmFullName() {
        return mFullName;
    }

    public void setmFullName(String mFullName) {
        this.mFullName = mFullName;
    }

    public String getmPhone() {
        return mPhone;
    }

    public void setmPhone(String mPhone) {
        this.mPhone = mPhone;
    }

    public int getmNumOfGuest() {
        return mNumOfGuest;
    }

    public void setmNumOfGuest(int mNumOfGuest) {
        this.mNumOfGuest = mNumOfGuest;
    }

    public boolean ismIsComing() {
        return mIsComing;
    }

    public void setmIsComing(boolean mIsComing) {
        this.mIsComing = mIsComing;
    }

    public String getmSide() {
        return mSide;
    }

    public void setmSide(String mSide) {
        this.mSide = mSide;
    }

    public String getmBelongingGroup() {
        return mBelongingGroup;
    }

    public void setmBelongingGroup(String mBelongingGroup) {
        this.mBelongingGroup = mBelongingGroup;
    }

}
