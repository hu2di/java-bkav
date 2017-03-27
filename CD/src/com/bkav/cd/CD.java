package com.bkav.cd;

public class CD {
	private int maCD;
	private String tenCD;
	private String caSi;
	private int soBaiHat;
	private double giaThanh;

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getTenCD() {
		return tenCD;
	}

	public void setTenCD(String tenCD) {
		this.tenCD = tenCD;
	}

	public String getCaSi() {
		return caSi;
	}

	public void setCaSi(String caSi) {
		this.caSi = caSi;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	public CD() {

	}

	public CD(int maCD, String tenCD, String caSi, int soBaiHat, double giaThanh) {
		this.maCD = maCD;
		this.tenCD = tenCD;
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	@Override
	public String toString() {
		return " Ma:" + maCD + "\n Ten:" + tenCD + "\n CaSi:" + caSi
				+ "\n SoBaiHat:" + soBaiHat + "\n Gia:" + giaThanh;
	}

	@Override
	public boolean equals(Object obj) {
		CD cd = new CD();
		cd = (CD) obj;
		if (cd.getTenCD().equals(tenCD)) {
			return true;
		} else {
			return false;
		}
	}
}
