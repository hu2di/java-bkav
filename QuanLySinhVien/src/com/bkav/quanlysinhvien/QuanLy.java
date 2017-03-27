package com.bkav.quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	ArrayList<SinhVien> dsSinhVien = new ArrayList<SinhVien>();

	public void nhapSinhVienTrungCap() {
		SinhVienTrungCap tempSV = new SinhVienTrungCap();
		Scanner qlIn = new Scanner(System.in);
		try {
			System.out.println("HoTen: ");
			tempSV.setTen(qlIn.nextLine());
			System.out.println("Ma: ");
			tempSV.setMa(qlIn.nextInt());
			System.out.println("DiemTrungBinhHocKi: ");
			tempSV.setDiemTrungBinhHocKi(qlIn.nextDouble());
			dsSinhVien.add(tempSV);
		} catch (Exception e) {
			System.out.print("Loi: ");
			e.printStackTrace();
			return;
		}
	}

	public void nhapSinhVienCaoDang() {
		SinhVienCaoDang tempSV = new SinhVienCaoDang();
		Scanner qlIn1 = new Scanner(System.in);
		try {
			System.out.println("HoTen: ");
			tempSV.setTen(qlIn1.nextLine());
			System.out.println("Ma: ");
			tempSV.setMa(qlIn1.nextInt());
			System.out.println("DiemTrungBinhHocKi: ");
			tempSV.setDiemTrungBinhHocKi(qlIn1.nextDouble());
			System.out.println("SoTinChiDatDuoc: ");
			tempSV.setSoTinChiDatDuoc(qlIn1.nextInt());
			System.out.println("DiemTrungBinhTichLuy: ");
			tempSV.setDiemTichLuy(qlIn1.nextDouble());
			dsSinhVien.add(tempSV);
		} catch (Exception e) {
			System.out.print("Loi: ");
			e.printStackTrace();
			return;
		}
	}

	public void nhapSinhVienDaiHoc() {
		SinhVienDaiHoc tempSV = new SinhVienDaiHoc();
		Scanner qlIn2 = new Scanner(System.in);
		try {
			System.out.println("HoTen: ");
			tempSV.setTen(qlIn2.nextLine());
			System.out.println("Ma: ");
			tempSV.setMa(qlIn2.nextInt());
			System.out.println("DiemTrungBinhHocKi: ");
			tempSV.setDiemTrungBinhHocKi(qlIn2.nextDouble());
			System.out.println("SoTinChiDatDuoc: ");
			tempSV.setSoTinChiDatDuoc(qlIn2.nextInt());
			System.out.println("DiemTrungBinhTichLuy: ");
			tempSV.setDiemTichLuy(qlIn2.nextDouble());
			qlIn2.nextLine();
			System.out.println("ChuyenNganhTuChon: ");
			tempSV.setChuyenNganhTuChon(qlIn2.nextLine());
			dsSinhVien.add(tempSV);
		} catch (Exception e) {
			System.out.print("Loi: ");
			e.printStackTrace();
			return;
		}
	}

	public void nhapSinhVienLienKet() {
		SinhVienLienKet tempSV = new SinhVienLienKet();
		Scanner qlIn3 = new Scanner(System.in);
		try {
			System.out.println("HoTen: ");
			tempSV.setTen(qlIn3.nextLine());
			System.out.println("Ma: ");
			tempSV.setMa(qlIn3.nextInt());
			System.out.println("DiemTrungBinhHocKi: ");
			tempSV.setDiemTrungBinhHocKi(qlIn3.nextDouble());
			System.out.println("SoTinChiDatDuoc: ");
			tempSV.setSoTinChiDatDuoc(qlIn3.nextInt());
			System.out.println("DiemTrungBinhTichLuy: ");
			tempSV.setDiemTichLuy(qlIn3.nextDouble());
			qlIn3.nextLine();
			System.out.println("ChuyenNganhTuChon: ");
			tempSV.setChuyenNganhTuChon(qlIn3.nextLine());
			System.out.println("TruongChuQuan: ");
			tempSV.setTruongChuQuan(qlIn3.nextLine());
			dsSinhVien.add(tempSV);
		} catch (Exception e) {
			System.out.print("Loi: ");
			e.printStackTrace();
			return;
		}
	}

	public void xoaSinhVien() {
		String ten;
		Scanner qlIn4 = new Scanner(System.in);
		try {
			System.out.println("Nhap ten sinh vien muon xoa: ");
			ten = qlIn4.nextLine();
		} catch (Exception e) {
			System.out.print("Loi: ");
			e.printStackTrace();
			return;
		}
		boolean kiemTra = true;
		for (int i = 0; i < dsSinhVien.size(); i++) {
			if (ten.equals(dsSinhVien.get(i).getTen())) {
				kiemTra = false;
				dsSinhVien.remove(i);
			}
		}
		if (kiemTra == true) {
			System.out.println("Khong ton tai ten sinh vien!");
		}
	}

	public void xuatThongTinSinhVien() {
		String ten;
		Scanner qlIn5 = new Scanner(System.in);
		try {
			System.out.println("Nhap ten sinh vien muon hien thi: ");
			ten = qlIn5.nextLine();
		} catch (Exception e) {
			System.out.print("Loi: ");
			e.printStackTrace();
			return;
		}
		boolean kiemTra = true;
		for (int i = 0; i < dsSinhVien.size(); i++) {
			if (ten.equals(dsSinhVien.get(i).getTen())) {
				kiemTra = false;
				if (dsSinhVien.get(i).getClass().getName()
						.equals(SinhVienTrungCap.class.getName())) {
					SinhVienTrungCap tempSV = new SinhVienTrungCap();
					tempSV = (SinhVienTrungCap) dsSinhVien.get(i);
					System.out.println("HoTen: " + tempSV.getTen() + " Ma: "
							+ tempSV.getMa() + " DiemTrungBinhHocKi: "
							+ tempSV.getDiemTrungBinhHocKi());
				} else if (dsSinhVien.get(i).getClass().getName()
						.equals(SinhVienCaoDang.class.getName())) {
					SinhVienCaoDang tempSV = new SinhVienCaoDang();
					tempSV = (SinhVienCaoDang) dsSinhVien.get(i);
					System.out.println("HoTen: " + tempSV.getTen() + " Ma: "
							+ tempSV.getMa() + " DiemTrungBinhHocKi: "
							+ tempSV.getDiemTrungBinhHocKi()
							+ " SoTinChiDatDuoc: "
							+ tempSV.getSoTinChiDatDuoc()
							+ " DiemTrungBinhTichLuy: "
							+ tempSV.getDiemTichLuy());
				} else if (dsSinhVien.get(i).getClass().getName()
						.equals(SinhVienDaiHoc.class.getName())) {
					SinhVienDaiHoc tempSV = new SinhVienDaiHoc();
					tempSV = (SinhVienDaiHoc) dsSinhVien.get(i);
					System.out.println("HoTen: " + tempSV.getTen() + " Ma: "
							+ tempSV.getMa() + " DiemTrungBinhHocKi: "
							+ tempSV.getDiemTrungBinhHocKi()
							+ " SoTinChiDatDuoc: "
							+ tempSV.getSoTinChiDatDuoc()
							+ " DiemTrungBinhTichLuy: "
							+ tempSV.getDiemTichLuy() + " ChuyenNganhTuChon: "
							+ tempSV.getChuyenNganhTuChon());
				} else if (dsSinhVien.get(i).getClass().getName()
						.equals(SinhVienLienKet.class.getName())) {
					SinhVienLienKet tempSV = new SinhVienLienKet();
					tempSV = (SinhVienLienKet) dsSinhVien.get(i);
					System.out.println("HoTen: " + tempSV.getTen() + " Ma: "
							+ tempSV.getMa() + " DiemTrungBinhHocKi: "
							+ tempSV.getDiemTrungBinhHocKi()
							+ " SoTinChiDatDuoc: "
							+ tempSV.getSoTinChiDatDuoc()
							+ " DiemTrungBinhTichLuy: "
							+ tempSV.getDiemTichLuy() + " ChuyenNganhTuChon: "
							+ tempSV.getChuyenNganhTuChon()
							+ " TruongChuQuan: " + tempSV.getTruongChuQuan());
				}
			}
		}
		if (kiemTra == true) {
			System.out.println("Khong ton tai ten sinh vien!");
		}
	}

	public void hienThiDanhSach() {
		for (int i = 0; i < dsSinhVien.size(); i++) {
			System.out.println("HoTen:  " + dsSinhVien.get(i).getTen()
					+ "   Ma:  " + dsSinhVien.get(i).getMa());
		}
	}
}
