package com.bkav.hinh;

public class HinhTron extends Hinh {
	public HinhTron() {
	}

	public HinhTron(String mauVe, int netVe) {
		this.mauVe = mauVe;
		this.netVe = netVe;
	}

	@Override
	public void ve() {
		System.out.println("Ve hinh tron mau: " + mauVe + " voi net: " + netVe);
	}

	@Override
	public void xoa() {
		System.out
				.println("Xoa hinh tron mau: " + mauVe + " voi net: " + netVe);
	}

	@Override
	public void diChuyen(int x, int y) {
		System.out.println("Di chuyen hinh tron mau: " + mauVe + " voi net: "
				+ netVe + " tu vi tri: (" + x + "," + y + ")!");
	}
}
