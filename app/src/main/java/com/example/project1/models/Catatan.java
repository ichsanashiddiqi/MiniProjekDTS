package com.example.project1.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Catatan implements Parcelable {

    String namaCatatan;
    int nomorCatatan;

    public String getNamaCatatan() {
        return namaCatatan;
    }

    public void setNamaCatatan(String namaCatatan) {
        this.namaCatatan = namaCatatan;
    }

    public int getNomorCatatan() {
        return nomorCatatan;
    }

    public void setNomorCatatan(int nomorCatatan) {
        this.nomorCatatan = nomorCatatan;
    }

    public Catatan(String namaCatatan, int nomorCatatan) {
        this.namaCatatan = namaCatatan;
        this.nomorCatatan = nomorCatatan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.nomorCatatan);
        dest.writeString(this.namaCatatan);
    }

    protected Catatan(Parcel in) {
        this.nomorCatatan = in.readInt();
        this.namaCatatan = in.readString();
    }

    public static final Parcelable.Creator<Catatan> CREATOR = new Parcelable.Creator<Catatan>() {
        @Override
        public Catatan createFromParcel(Parcel source) {
            return new Catatan(source);
        }

        @Override
        public Catatan[] newArray(int size) {
            return new Catatan[size];
        }
    };
}
