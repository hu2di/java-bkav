package com.bkav.time;

public class Date {
	private int dd;
	private int mm;
	private int yy;

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}

	public Date() {

	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public boolean kiemTra() {
		if ((mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12)
				&& (yy >= 0)) {
			if (dd >= 1 && dd <= 31) {
				return true;
			} else {
				return false;
			}
		} else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && (yy >= 0)) {
			if (dd >= 1 && dd <= 30) {
				return true;
			} else {
				return false;
			}
		} else if ((mm == 2) && (yy >= 0)) {
			if (dd == 29 && (yy % 4 == 0) && yy % 100 != 0) {
				return true;
			} else if (dd == 29 && yy % 100 == 0 && yy % 400 == 0) {
				return true;
			} else if (dd == 28) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public int soNgayTrongNam() {
		if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 100 == 0 && yy % 400 == 0)) {
			return 366;
		} else {
			return 365;
		}
	}

	public int soNgayTrongThang() {
		if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10
				|| mm == 12) {
			return 31;
		} else if (mm == 4 || mm == 6 || mm == 9 || mm == 11) {
			return 30;
		} else {
			if (soNgayTrongNam() == 366) {
				return 29;
			} else {
				return 28;
			}
		}
	}
}
