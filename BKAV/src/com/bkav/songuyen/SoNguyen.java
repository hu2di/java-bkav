package com.bkav.songuyen;

public class SoNguyen {
    private int v;
    public SoNguyen(){
        v=0;
    }
    public SoNguyen(int val){
        v=val;
    }
    public int getValue(){
        return v;
    }
    public void setValue(int v){
        this.v = v;
    }
}
