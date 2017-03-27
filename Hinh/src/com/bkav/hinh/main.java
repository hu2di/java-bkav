package com.bkav.hinh;

public class main {
	public static void main(String args[]) {
		HinhTron hinhTron = new HinhTron("MauXanh", 1);
		HinhVuong hinhVuong = new HinhVuong("MauDo", 2);
		DaGiac daGiac = new DaGiac("MauTim", 3);
		HinhTru hinhTru = new HinhTru("MauVang", 4);
		ChuNhat chuNhat = new ChuNhat("MauCam", 5);
		Ve veHinh = new Ve();
		veHinh.veHinh(hinhTron);
		veHinh.veHinh(hinhVuong);
		veHinh.veHinh(daGiac);
		veHinh.veHinh(hinhTru);
		veHinh.veHinh(chuNhat);
	}
}
