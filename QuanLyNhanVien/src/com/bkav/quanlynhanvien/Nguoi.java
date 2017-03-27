package com.bkav.quanlynhanvien;

public class Nguoi {
    private int maSo;
    private String hoTen;
    public Nguoi(){
    }
    public Nguoi(int maSo,String hoTen){
        this.maSo=maSo;
        this.hoTen=hoTen;
    }
    public void setMaSo(int maSo){
        this.maSo = maSo;
    }
    public int getMaSo(){
        return maSo;
    } 
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    public String getHoTen(){
        return hoTen;
    }
}
