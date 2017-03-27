package com.bkav.quanlysinhvien;

public class SinhVienTrungCap extends SinhVien {
	protected double diemTrungBinhHocKi;

	public double getDiemTrungBinhHocKi() {
		return diemTrungBinhHocKi;
	}

	public void setDiemTrungBinhHocKi(double diemTrungBinhHocKi) {
		this.diemTrungBinhHocKi = diemTrungBinhHocKi;
	}

	public SinhVienTrungCap() {
		super();
	}

	public SinhVienTrungCap(String ten, int ma, double diemTrungBinhHocKi) {
		super(ten,ma);
		this.diemTrungBinhHocKi = diemTrungBinhHocKi;
	}

}
