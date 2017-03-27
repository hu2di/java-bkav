package com.bkav.quanlysinhvien;

public class SinhVienLienKet extends SinhVienDaiHoc {
	protected String truongChuQuan;

	public String getTruongChuQuan() {
		return truongChuQuan;
	}

	public void setTruongChuQuan(String truongChuQuan) {
		this.truongChuQuan = truongChuQuan;
	}

	public SinhVienLienKet() {
		super();
	}

	public SinhVienLienKet(String ten, int ma, double diemTrungBinhHocKi,
			int soTinChiDatDuoc, double diemTichLuy, String chuyenNganhTuChon,
			String truongChuQuan) {
		super(ten, ma, diemTrungBinhHocKi, soTinChiDatDuoc, diemTichLuy,
				chuyenNganhTuChon);
		this.truongChuQuan = truongChuQuan;
	}

}
