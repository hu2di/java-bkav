package com.bkav.quanlysinhvien;

public class SinhVien {
	protected String ten;
	protected int ma;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getMa() {
		return ma;
	}

	public void setMa(int ma) {
		this.ma = ma;
	}

	public SinhVien() {

	}

	public SinhVien(String ten, int ma) {
		this.ten = ten;
		this.ma = ma;
	}
}
