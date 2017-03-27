package com.bkav.quanlyhocvien;

public class ThongTinConNguoi {
	protected String ten;
	protected String diaChi;

	public ThongTinConNguoi() {
	}

	public ThongTinConNguoi(String ten, String diaChi) {
		this.ten = ten;
		this.diaChi = diaChi;
	}

	public String getTen() {
		return ten;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
}
