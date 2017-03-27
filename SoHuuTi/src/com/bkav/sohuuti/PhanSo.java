package com.bkav.sohuuti;

public class PhanSo {
	protected int tuSo;
	protected int mauSo;

	public int getTuSo() {
		return tuSo;
	}

	public void setTuSo(int tuSo) {
		this.tuSo = tuSo;
	}

	public int getMauSo() {
		return mauSo;
	}

	public void setMauSo(int mauSo) {
		this.mauSo = mauSo;
	}

	public PhanSo() {

	}

	public PhanSo(int tuSo, int mauSo) {
		this.tuSo = tuSo;
		this.mauSo = mauSo;
	}

	@Override
	public String toString() {
		return tuSo + "/" + mauSo;
	}

	public int UCLN(int a, int b) {
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	public int BCNN(int a, int b) {
		return a * b / UCLN(a, b);
	}

	public void rutGonPhanSo() {
		int ucln = UCLN(tuSo, mauSo);
		tuSo = tuSo / ucln;
		mauSo = mauSo / ucln;
	}

	public PhanSo congPhanSo(PhanSo ps1, PhanSo ps2) {
		PhanSo tong = new PhanSo();
		int mauChung = BCNN(ps1.getMauSo(), ps2.getMauSo());
		tong.setMauSo(mauChung);
		tong.setTuSo(ps1.getTuSo() * (mauChung / ps1.getMauSo())
				+ ps2.getTuSo() * (mauChung / ps2.getMauSo()));
		tong.rutGonPhanSo();
		return tong;
	}

	public PhanSo truPhanSo(PhanSo ps1, PhanSo ps2) {
		PhanSo hieu = new PhanSo();
		int mauChung = BCNN(ps1.getMauSo(), ps2.getMauSo());
		hieu.setMauSo(mauChung);
		hieu.setTuSo(ps1.getTuSo() * (mauChung / ps1.getMauSo())
				- ps2.getTuSo() * (mauChung / ps2.getMauSo()));
		hieu.rutGonPhanSo();
		return hieu;
	}

	public PhanSo nhanPhanSo(PhanSo ps1, PhanSo ps2) {
		PhanSo nhan = new PhanSo();
		nhan.setMauSo(ps1.getMauSo() * ps2.getMauSo());
		nhan.setTuSo(ps1.getTuSo() * ps2.getTuSo());
		nhan.rutGonPhanSo();
		return nhan;
	}

	public PhanSo chiaPhanSo(PhanSo ps1, PhanSo ps2) {
		PhanSo chia = new PhanSo();
		chia.setMauSo(ps1.getMauSo() * ps2.getTuSo());
		chia.setTuSo(ps1.getTuSo() * ps2.getMauSo());
		chia.rutGonPhanSo();
		return chia;
	}

	public int soSanh(PhanSo ps1, PhanSo ps2) {
		ps1.rutGonPhanSo();
		ps2.rutGonPhanSo();
		int mauChung = BCNN(ps1.getMauSo(), ps2.getMauSo());
		ps1.setTuSo(mauChung / ps1.getMauSo() * ps1.getTuSo());
		ps1.setMauSo(mauChung);
		ps2.setTuSo(mauChung / ps2.getMauSo() * ps2.getTuSo());
		ps2.setMauSo(mauChung);
		if (ps1.getTuSo() > ps2.getTuSo()) {
			return 1;
		} else if (ps1.getTuSo() == ps2.getTuSo()) {
			return 0;
		} else {
			return -1;
		}
	}
}
