package com.bkav.hinh;

public abstract class Hinh {
	protected String mauVe;
	protected int netVe;

	public String getMauVe() {
		return mauVe;
	}

	public void setMauVe(String mauVe) {
		this.mauVe = mauVe;
	}

	public int getNetVe() {
		return netVe;
	}

	public void setNetVe(int netVe) {
		this.netVe = netVe;
	}

	public void gioiThieu() {
		System.out.println("Mau ve: " + mauVe + " Net ve: " + netVe);
	}

	abstract void ve();

	abstract void xoa();

	abstract void diChuyen(int x, int y);
}
