package com.bkav.quanlynhanvien;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// NhapThongTin
		int n = 0;
		try {
			System.out.println("Nhap so nhan vien:");
			n = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap sai so nhan vien!");
		}
		NhanVien nhanVien[] = new NhanVien[n];
		System.out.println("Nhap thong tin nhan vien:");
		for (int i = 0; i < n; i++) {
			nhanVien[i] = new NhanVien();
			try {
				System.out.println("Ma so:");
				nhanVien[i].setMaSo(sc.nextInt());
				System.out.println("Ho ten:");
				nhanVien[i].setHoTen(sc.next());
				System.out.println("He so luong:");
				nhanVien[i].setHeSoLuong(sc.nextFloat());
			} catch (Exception e) {
				System.out.println("Nhap sai!");
			}
			System.out.println();
		}

		// SapXep
		try {
			System.out.println("Sap Xep:");
			nhanVien = sapXepDanhSachNhanVien(nhanVien,n);
			inDanhSachNhanVien(nhanVien,n);
		} catch (NullPointerException e) {
			System.out.println("Mang rong!");
		}

		// XoaNhanVien
		int maSoXoa = 0;
		try {
			System.out.println("Nhap Ma So nhan vien muon Xoa");
			maSoXoa = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap sai");
		}
		for (int i = 0; i < n; i++) {
			if (nhanVien[i].getMaSo() == maSoXoa) {
				for (int j = i; j < n - 1; j++) {
					nhanVien[j] = nhanVien[j + 1];
				}
				n--;
				break;
			}
		}
		System.out.println("Danh sach con lai.");
		try {
			inDanhSachNhanVien(nhanVien,n);
		} catch (Exception e) {
			System.out.println("Co loi");
			e.printStackTrace();
		}

		// InDanhSachNhanVienHeSoLuong>2.5
		System.out.println("Danh Sach nhan vien co he so luong > 2.5:");
		for (int i = 0; i < n; i++) {
			if (nhanVien[i].getHeSoLuong() > 2.5) {
				System.out.println(nhanVien[i].getHoTen());
			}
		}

		// TimNhanVienCoHeSoLuongLonNhat
		float heSoLuongMax = nhanVien[0].getHeSoLuong();
		for (int i = 0; i < n; i++) {
			if (nhanVien[i].getHeSoLuong() > heSoLuongMax) {
				heSoLuongMax = nhanVien[i].getHeSoLuong();
			}
		}
		System.out.println("Nhan vien co he so luong max:");
		for (int i = 0; i < n; i++) {
			if (nhanVien[i].getHeSoLuong() == heSoLuongMax) {
				System.out.println(nhanVien[i].getHoTen());
			}
		}
		// TimNhanVienCoHeSoLuongNhoNhat
		float heSoLuongMin = nhanVien[0].getHeSoLuong();
		for (int i = 0; i < n; i++) {
			if (nhanVien[i].getHeSoLuong() < heSoLuongMin) {
				heSoLuongMin = nhanVien[i].getHeSoLuong();
			}
		}
		System.out.println("Nhan vien co he so luong min:");
		for (int i = 0; i < n; i++) {
			if (nhanVien[i].getHeSoLuong() == heSoLuongMin) {
				System.out.println(nhanVien[i].getHoTen());
			}
		}

		sc.close();
	}

	public static void inDanhSachNhanVien(NhanVien nhanVien[],int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(nhanVien[i].getHoTen());
		}
	}

	/*
	 * public static void inDanhSachNhanVien(NhanVien nhanVien[]){ for(NhanVien
	 * nv:nhanVien){ System.out.println(nv.getHoTen()); } }
	 */

	public static NhanVien[] sapXepDanhSachNhanVien(NhanVien nhanVien[],int n) {
		NhanVien temp = new NhanVien();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (nhanVien[i].getHoTen().equalsIgnoreCase(nhanVien[j].getHoTen())) {
					temp = nhanVien[i];
					nhanVien[i] = nhanVien[j];
					nhanVien[j] = temp;
				}
			}
		}
		return nhanVien;
	}
}
