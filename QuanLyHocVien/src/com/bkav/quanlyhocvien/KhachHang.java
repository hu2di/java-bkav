package com.bkav.quanlyhocvien;

import java.io.Serializable;

public class KhachHang extends ThongTinConNguoi implements Serializable {
	private String nganhHang;
	private int soLuong;
	private double donGia;

	public KhachHang() {
	}

	public KhachHang(String ten, String diaChi, String nganhHang, int soLuong,
			double donGia) {
		super(ten, diaChi);
		this.nganhHang = nganhHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public String getNganhHang() {
		return nganhHang;
	}

	public void setNganhHang(String nganhHang) {
		this.nganhHang = nganhHang;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public void nhapThongTin(String ten, String diaChi, String nganhHang,
			int soLuong, double donGia) {
		this.ten = ten;
		this.diaChi = diaChi;
		this.nganhHang = nganhHang;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}

	public void xuatHoaDon() {
		System.out.println("Ten: " + ten + " Dia Chi: " + diaChi
				+ " Nganh Hang: " + nganhHang + " So Luong: " + soLuong
				+ " Don Gia: " + donGia);
	}
}
