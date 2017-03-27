package com.bkav.quanlyhocvien;

import java.io.Serializable;

public class NhanVien extends ThongTinConNguoi implements Serializable {
	final int LUONGCOBAN = 2000000;
	private double heSoLuong;
	private String chucVu;

	public NhanVien() {
	}

	public NhanVien(String ten, String diaChi, double heSoLuong, String chucVu) {
		super(ten, diaChi);
		this.heSoLuong = heSoLuong;
		this.chucVu = chucVu;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public double tinhLuong() {
		return LUONGCOBAN * heSoLuong;
	}

	public void thayDoiThongTin(String ten, String diaChi, double heSoLuong,
			String chucVu) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.heSoLuong = heSoLuong;
		this.chucVu = chucVu;
	}

	public void xuatThongBaoLuong() {
		System.out.println("Ho Ten: " + ten + " Salary: " + tinhLuong());
	}
}
