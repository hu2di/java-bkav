package com.bkav.quanlynhanvien;

public class NhanVien extends Nguoi {
    
    private float heSoLuong;
    public NhanVien(){
    }
    public NhanVien(float heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    public float getHeSoLuong(){
        return heSoLuong;
    }
    public void setHeSoLuong(float heSoLuong){
        this.heSoLuong = heSoLuong;
    }
}