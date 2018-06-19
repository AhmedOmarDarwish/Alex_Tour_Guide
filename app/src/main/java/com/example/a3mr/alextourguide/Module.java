package com.example.a3mr.alextourguide;


import android.os.Parcel;
import android.os.Parcelable;

public class Module implements Parcelable {
    private int img;
    private String title;
    private int place_image;
    private String address;
    private String about;
    public Module(int pimg, String ptitle) {
        img = pimg;
        title = ptitle;}


    public Module(int pimg, String ptitle, int place_img, String paddress, String pabout) {
        img = pimg;
        title = ptitle;
        place_image = place_img;
        address = paddress;
        about=pabout;

    }

    protected Module(Parcel in) {
        img = in.readInt();
        title = in.readString();
        place_image = in.readInt();
        address = in.readString();
        about = in.readString();
    }

    public static final Creator <Module> CREATOR = new Creator <Module>() {
        @Override
        public Module createFromParcel(Parcel in) {
            return new Module( in );
        }

        @Override
        public Module[] newArray(int size) {
            return new Module[size];
        }
    };

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAbout() {
        return about;
    }

    public int getPlace_image() {
        return place_image;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPlace_image(int place_image) {
        this.place_image = place_image;
    }

    public int getImg() {
        return img;
    }

    public String getTitle() {
        return title;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt( img );
        dest.writeString( title );
        dest.writeInt( place_image );
        dest.writeString( address );
        dest.writeString( about );
    }
}
