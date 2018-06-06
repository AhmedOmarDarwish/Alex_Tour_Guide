package com.example.a3mr.alextourguide;


public class Module {
    private int img;
    private String title;

    public Module(int pimg, String ptitle){
        img=pimg;
        title=ptitle;

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
}
