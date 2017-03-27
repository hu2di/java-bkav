package com.bkav.nhansu;

import java.io.Serializable;

public class NhanVien implements NhanVienImpl, Serializable {
	final int LUONGCOBAN = 3000000;
	protected int maNhanVien, tuoi;
	protected String hoTen;
	protected double heSoLuong;

	public NhanVien() {

	}

	public NhanVien(int maNhanVien, int tuoi, String hoTen, double heSoLuong) {
		this.maNhanVien = maNhanVien;
		this.tuoi = tuoi;
		this.hoTen = hoTen;
		this.heSoLuong = heSoLuong;
	}

	public int getMaNhanVien() {
		return maNhanVien;
	}

	public int getTuoi() {
		return tuoi;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setMaNhanVien(int maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	@Override
	public double tinhLuong() {
		return heSoLuong * LUONGCOBAN;
	}
}
