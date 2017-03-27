package com.bkav.quanlysinhvien;

public class SinhVienDaiHoc extends SinhVienCaoDang {
	protected String chuyenNganhTuChon;

	public String getChuyenNganhTuChon() {
		return chuyenNganhTuChon;
	}

	public void setChuyenNganhTuChon(String chuyenNganhTuChon) {
		this.chuyenNganhTuChon = chuyenNganhTuChon;
	}

	public SinhVienDaiHoc() {
		super();
	}

	public SinhVienDaiHoc(String ten, int ma, double diemTrungBinhHocKi,
			int soTinChiDatDuoc, double diemTichLuy, String chuyenNganhTuChon) {
		super(ten, ma, diemTrungBinhHocKi, soTinChiDatDuoc, diemTichLuy);
		this.chuyenNganhTuChon = chuyenNganhTuChon;
	}

}
