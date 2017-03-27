package com.bkav.sohuuti;

import java.util.Random;

public class HonSo extends PhanSo {
	private int phanNguyen;

	public void setPhanNguyen(int phanNguyen) {
		this.phanNguyen = phanNguyen;
	}

	public int getPhanNguyen() {
		return phanNguyen;
	}

	public HonSo() {
		super();
	}

	public HonSo(int phanNguyen, int tuSo, int mauSo) {
		super(tuSo, mauSo);
		this.phanNguyen = phanNguyen;
	}

	@Override
	public String toString() {
		return phanNguyen + "," + tuSo + "/" + mauSo;
	}

	public void rutGonHonSo() {
		if (tuSo > mauSo) {
			int themPhanNguyen = tuSo / mauSo;
			phanNguyen += themPhanNguyen;
			tuSo = tuSo - mauSo * themPhanNguyen;
			PhanSo ps = new PhanSo(tuSo, mauSo);
			ps.rutGonPhanSo();
			tuSo = ps.getTuSo();
			mauSo = ps.getMauSo();
		}
	}

	public PhanSo toPhanSo() {
		PhanSo phanSo = new PhanSo();
		phanSo.setTuSo(mauSo * phanNguyen + tuSo);
		phanSo.setMauSo(mauSo);
		phanSo.rutGonPhanSo();
		return phanSo;
	}

	public HonSo congHonSo(HonSo hs1, HonSo hs2) {
		HonSo tong = new HonSo();
		PhanSo ps1 = new PhanSo(hs1.getTuSo(), hs1.getMauSo());
		PhanSo ps2 = new PhanSo(hs2.getTuSo(), hs2.getMauSo());
		PhanSo ps3 = new PhanSo();
		ps3.congPhanSo(ps1, ps2);
		tong.setPhanNguyen(hs1.getPhanNguyen() + hs2.getPhanNguyen());
		tong.setTuSo(ps3.getTuSo());
		tong.setMauSo(ps3.getMauSo());
		tong.rutGonHonSo();
		return tong;
	}

	public HonSo truHonSo(HonSo hs1, HonSo hs2) {
		HonSo hieu = new HonSo();
		PhanSo ps1 = new PhanSo(hs1.getTuSo(), hs1.getMauSo());
		PhanSo ps2 = new PhanSo(hs2.getTuSo(), hs2.getMauSo());
		PhanSo ps3 = new PhanSo();
		ps3.truPhanSo(ps1, ps2);
		hieu.setPhanNguyen(hs1.getPhanNguyen() - hs2.getPhanNguyen());
		hieu.setTuSo(ps3.getTuSo());
		hieu.setMauSo(ps3.getMauSo());
		hieu.rutGonHonSo();
		return hieu;
	}

	public HonSo nhanHonSo(HonSo hs1, HonSo hs2) {
		HonSo tich = new HonSo();
		PhanSo ps = new PhanSo();
		ps.nhanPhanSo(hs1.toPhanSo(), hs2.toPhanSo());
		tich.setPhanNguyen(1);
		tich.setTuSo(ps.getTuSo());
		tich.setMauSo(ps.getMauSo());
		tich.rutGonHonSo();
		return tich;
	}

	public HonSo chiaHonSo(HonSo hs1, HonSo hs2) {
		HonSo thuong = new HonSo();
		PhanSo ps = new PhanSo();
		ps.chiaPhanSo(hs1.toPhanSo(), hs2.toPhanSo());
		thuong.setPhanNguyen(1);
		thuong.setTuSo(ps.getTuSo());
		thuong.setMauSo(ps.getMauSo());
		thuong.rutGonHonSo();
		return thuong;
	}

	public int soSanh(HonSo hs1, HonSo hs2) {
		PhanSo ps1 = new PhanSo();
		return ps1.soSanh(hs1.toPhanSo(), hs2.toPhanSo());
	}

	public static void main(String args[]) {
		// PhanSoCal
		PhanSo a = new PhanSo(2, 3);
		PhanSo b = new PhanSo(1, 4);
		PhanSo ql = new PhanSo();
		ql = ql.congPhanSo(a, b);
		System.out.println("Tong: " + a.toString() + " + " + b.toString()
				+ " = " + ql.toString());
		ql = ql.truPhanSo(a, b);
		System.out.println("Tru: " + a.toString() + " - " + b.toString()
				+ " = " + ql.toString());
		ql = ql.nhanPhanSo(a, b);
		System.out.println("Nhan: " + a.toString() + " x " + b.toString()
				+ " = " + ql.toString());
		ql = ql.chiaPhanSo(a, b);
		System.out.println("Chia: " + a.toString() + " : " + b.toString()
				+ " = " + ql.toString());

		// TaoMangHonSo
		HonSo arrHonSo[] = new HonSo[10];
		for (int i = 0; i < 10; i++) {
			arrHonSo[i] = new HonSo();
			int ranNum = new Random().nextInt(19) + 1;
			arrHonSo[i].setPhanNguyen(ranNum);
			ranNum = new Random().nextInt(19) + 1;
			arrHonSo[i].setTuSo(ranNum);
			ranNum = new Random().nextInt(19) + 1;
			arrHonSo[i].setMauSo(ranNum);
			arrHonSo[i].rutGonHonSo();
		}

		// InRaManHinh
		for (int i = 0; i < 10; i++) {
			System.out.println(arrHonSo[i].toString());
		}

		// TinhToan
		try {
			HonSo hs = new HonSo();
			hs = hs.congHonSo(arrHonSo[0], arrHonSo[1]);
			System.out.println(arrHonSo[0].toString() + " + " + arrHonSo[1]
					+ " = " + hs.toString());
			hs = hs.truHonSo(arrHonSo[2], arrHonSo[3]);
			System.out.println(arrHonSo[2].toString() + " - " + arrHonSo[3]
					+ " = " + hs.toString());
			hs = hs.nhanHonSo(arrHonSo[4], arrHonSo[5]);
			System.out.println(arrHonSo[4].toString() + " x " + arrHonSo[5]
					+ " = " + hs.toString());
			hs = hs.chiaHonSo(arrHonSo[6], arrHonSo[7]);
			System.out.println(arrHonSo[6].toString() + " : " + arrHonSo[7]
					+ " = " + hs.toString());
		} catch (Exception e) {
			System.out.println("Loi!");
		}
	}
}
