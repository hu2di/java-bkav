package com.bkav.quanlyhocvien;

import java.io.Serializable;

public class SinhVien extends ThongTinConNguoi implements Serializable {
	private double diemMonHoc1, diemMonHoc2;

	public SinhVien() {
	}

	public SinhVien(String ten, String diaChi, double diemMonHoc1,
			double diemMonHoc2) {
		super(ten, diaChi);
		this.diemMonHoc1 = diemMonHoc1;
		this.diemMonHoc2 = diemMonHoc2;
	}

	public double getDiemMonHoc1() {
		return diemMonHoc1;
	}

	public double getDiemMonHoc2() {
		return diemMonHoc2;
	}

	public void setDiemMonHoc1(double diemMonHoc1) {
		this.diemMonHoc1 = diemMonHoc1;
	}

	public void setDiemMonHoc2(double diemMonHoc2) {
		this.diemMonHoc2 = diemMonHoc2;
	}

	public void nhapDiem(double diemMonHoc1, double diemMonHoc2) {
		this.diemMonHoc1 = diemMonHoc1;
		this.diemMonHoc2 = diemMonHoc2;
	}

	public double diemTrungBinh() {
		return (diemMonHoc1 + diemMonHoc2) / 2;
	}

	public void thayDoiThongTin(String ten, String diaChi, double diemMonHoc1,
			double diemMonHoc2) {
		setTen(ten);
		setDiaChi(diaChi);
		this.diemMonHoc1 = diemMonHoc1;
		this.diemMonHoc2 = diemMonHoc2;
	}

	public void xuatKetQua() {
		System.out.println("Ten: " + getTen() + " Dia Chi: " + getDiaChi()
				+ " Diem Mon 1: " + diemMonHoc1 + " Diem Mon 2: " + diemMonHoc2
				+ " Diem trung binh: " + diemTrungBinh());
	}
}
