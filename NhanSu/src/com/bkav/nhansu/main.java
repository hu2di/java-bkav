package com.bkav.nhansu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {

	public static void main(String args[]) {
		ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
		FileOutputStream fOut;
		FileInputStream fIn;

		// NhapVao
		try {
			dsNhanVien.add(new QuanLy(4, 0, 23, "Hungdh", 3));
			dsNhanVien.add(new QuanLy(3, 1, 24, "Thangdn", 3));
			dsNhanVien.add(new NhanVien(2, 23, "Manhlv", 1.7));
			dsNhanVien.add(new NhanVien(3, 25, "Huongdtm", 1.9));
			dsNhanVien.add(new NhanVien(4, 26, "Giangtth", 1.8));
			dsNhanVien.add(new NhanVien(4, 27, "Namtq", 2.1));
			dsNhanVien.add(new NhanVien(6, 28, "Anhlt", 1.5));
			dsNhanVien.add(new NhanVien(7, 29, "Haidd", 2.0));
			dsNhanVien.add(new NhanVien(8, 30, "Danglh", 1.6));
		} catch (Exception e) {
			System.out.println("Co Loi!!!");
			return;
		}

		// GhiRaFile
		try {
			fOut = new FileOutputStream("Data.dat");
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(dsNhanVien);
			oOut.close();
			fOut.close();
		} catch (Exception e) {
			System.out.println("Loi!!!");
			e.printStackTrace();
			return;
		}

		// DocTuFileVaSapXep
		System.out.println("SAP XEP");
		ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
		try {
			fIn = new FileInputStream("Data.dat");
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			dsNV = (ArrayList<NhanVien>) (oIn.readObject());
			oIn.close();
			fIn.close();
		} catch (Exception e) {
			System.out.println("Loi!!!");
			e.printStackTrace();
			return;
		}
		Collections.sort(dsNV, new Comparator<NhanVien>() {
			@Override
			public int compare(NhanVien nv1, NhanVien nv2) {
				return (nv1.getHoTen().compareTo(nv2.getHoTen()));
			}
		});
		for (int i = 0; i < dsNV.size(); i++) {
			System.out.println("Ho ten:" + dsNV.get(i).getHoTen());
		}

		// InLuong
		System.out.println("IN BANG LUONG");
		for (int i = 0; i < dsNhanVien.size(); i++) {
			System.out.println("Ho ten: " + dsNhanVien.get(i).getHoTen()
					+ " Salary: " + dsNhanVien.get(i).tinhLuong());
		}

		// InDanhSachQuanLy
		System.out.println("IN QUAN LY");
		for (int i = 0; i < dsNhanVien.size(); i++) {
			if (dsNhanVien.get(i) instanceof QuanLy) {
				System.out.println("Ho ten quan ly: "
						+ dsNhanVien.get(i).getHoTen() + " Salary: "
						+ dsNhanVien.get(i).tinhLuong());
			}
		}

		// InNhanVien.Salary>5trieu
		System.out.println("NHAN VIEN SALARY>5TRIEU");
		for (int i = 0; i < dsNhanVien.size(); i++) {
			if (dsNhanVien.get(i).tinhLuong() > 5000000) {
				System.out.println("Ho ten: " + dsNhanVien.get(i).getHoTen()
						+ " Salary: " + dsNhanVien.get(i).tinhLuong());
			}
		}

		// InNhanVienNhoHon25Tuoi
		System.out.println("NHAN VIEN NHO HON 25 TUOI");
		for (int i = 0; i < dsNhanVien.size(); i++) {
			if (dsNhanVien.get(i).getTuoi() < 25) {
				System.out.println("Ho ten: " + dsNhanVien.get(i).getHoTen());
			}
		}
	}
}
