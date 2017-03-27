package com.bkav.quanlysinhvien;

public class SinhVienCaoDang extends SinhVienTrungCap {
	protected int soTinChiDatDuoc;
	protected double diemTichLuy;

	public int getSoTinChiDatDuoc() {
		return soTinChiDatDuoc;
	}

	public void setSoTinChiDatDuoc(int soTinChiDatDuoc) {
		this.soTinChiDatDuoc = soTinChiDatDuoc;
	}

	public double getDiemTichLuy() {
		return diemTichLuy;
	}

	public void setDiemTichLuy(double diemTichLuy) {
		this.diemTichLuy = diemTichLuy;
	}

	public SinhVienCaoDang() {
		super();
	}

	public SinhVienCaoDang(String ten, int ma, double diemTrungBinhHocKi,
			int soTinChiDatDuoc, double diemTichLuy) {
		super(ten, ma, diemTrungBinhHocKi);
		this.soTinChiDatDuoc = soTinChiDatDuoc;
		this.diemTichLuy = diemTichLuy;
	}
}
