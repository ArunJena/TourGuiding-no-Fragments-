package com.example.tourgiuiding2;

import android.os.Parcel;
import android.os.Parcelable;

public class EachItem implements Parcelable {
    private int img_rcs;
    private String name;

    public EachItem(int img_rcs, String name) {
        this.img_rcs = img_rcs;
        this.name = name;
    }

    public EachItem(String name) {
        this.name = name;
    }

    protected EachItem(Parcel in) {
        img_rcs = in.readInt();
        name = in.readString();
    }

    public static final Creator<EachItem> CREATOR = new Creator<EachItem>() {
        @Override
        public EachItem createFromParcel(Parcel in) {
            return new EachItem(in);
        }

        @Override
        public EachItem[] newArray(int size) {
            return new EachItem[size];
        }
    };

    public int getImg_rcs() {
        return img_rcs;
    }

    public void setImg_rcs(int img_rcs) {
        this.img_rcs = img_rcs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(img_rcs);
        dest.writeString(name);
    }
}
