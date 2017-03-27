package com.bkav.hinh;

public class HinhVuong extends Hinh {
	public HinhVuong() {
	}
	
	public HinhVuong(String mauVe, int netVe) {
		this.mauVe = mauVe;
		this.netVe = netVe;
	}

	@Override
	public void ve() {
		System.out
				.println("Ve hinh vuong mau: " + mauVe + " voi net: " + netVe);
	}

	@Override
	public void xoa() {
		System.out.println("Xoa hinh vuong mau: " + mauVe + " voi net: "
				+ netVe);
	}

	@Override
	public void diChuyen(int x, int y) {
		System.out.println("Di chuyen hinh vuong mau: " + mauVe + " voi net: "
				+ netVe + " tu vi tri: (" + x + "," + y + ")!");
	}
}
