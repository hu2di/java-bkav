package com.bkav.nhansu;

import java.io.Serializable;

public class QuanLy extends NhanVien implements NhanVienImpl, Serializable {

	private int soNhanVienQuanLy;

	public int getSoNhanVienQuanLy() {
		return soNhanVienQuanLy;
	}

	public void setSoNhanVienQuanLy(int soNhanVienQuanLy) {
		this.soNhanVienQuanLy = soNhanVienQuanLy;
	}

	public QuanLy() {
	}

	public QuanLy(int soNhanVienQuanLy, int maNhanVien, int tuoi, String hoTen,
			double heSoLuong) {
		super(maNhanVien, tuoi, hoTen, heSoLuong);
		this.soNhanVienQuanLy = soNhanVienQuanLy;
	}

	@Override
	public double tinhLuong() {
		return LUONGCOBAN * heSoLuong * (1 + soNhanVienQuanLy * 0.1);
	}
}
