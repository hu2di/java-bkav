package com.bkav.hinh;

public class DaGiac extends Hinh {
	public DaGiac() {	
	}
	
	public DaGiac(String mauVe, int netVe) {
		this.mauVe = mauVe;
		this.netVe = netVe;
	}

	@Override
	public void ve() {
		System.out.println("Ve hinh da giac mau: " + mauVe + " voi net: "
				+ netVe);
	}

	@Override
	public void xoa() {
		System.out.println("Xoa hinh da giac mau: " + mauVe + " voi net: "
				+ netVe);
	}

	@Override
	public void diChuyen(int x, int y) {
		System.out.println("Di chuyen hinh da giac mau: " + mauVe
				+ " voi net: " + netVe + " tu vi tri: (" + x + "," + y + ")!");
	}
}
