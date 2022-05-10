package com.example.recycleview.modle;

public class SinhVien {
    private int maSV;
    private String tenSV;
    public SinhVien(int maSV, String tenSV){
        this.maSV = maSV;
        this.tenSV = tenSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
}
