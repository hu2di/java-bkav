package com.bkav.quanlyhocvien;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLy {
	ArrayList<ThongTinConNguoi> danhSach = new ArrayList<ThongTinConNguoi>();

	public QuanLy() {
	}

	public void docFile() {
		try {
			FileInputStream fIn = new FileInputStream("Dulieu.dat");
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			danhSach = (ArrayList<ThongTinConNguoi>) oIn.readObject();
			oIn.close();
			fIn.close();
		} catch (Exception e) {
			System.out.println("Loi!");
			e.printStackTrace();
		}
	}

	public void ghiFile() {
		try {
			FileOutputStream fOut = new FileOutputStream("Dulieu.dat");
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(danhSach);
			oOut.close();
			fOut.close();
		} catch (Exception e) {
			System.out.println("Loi!");
			e.printStackTrace();
		}
	}

	public void themNhanVien() {
		NhanVien them = new NhanVien();
		try {
			Scanner input1 = new Scanner(System.in);
			System.out.print("Ten:");
			them.setTen(input1.nextLine());
			System.out.print("Dia chi:");
			them.setDiaChi(input1.nextLine());
			System.out.print("Chuc vu:");
			them.setChucVu(input1.nextLine());
			System.out.print("He so luong:");
			them.setHeSoLuong(input1.nextDouble());
			danhSach.add(them);
		} catch (Exception e) {
			System.out.println("Loi!!!");
			e.printStackTrace();
			return;
		}
	}

	public void themSinhVien() {
		SinhVien them = new SinhVien();
		try {
			Scanner input2 = new Scanner(System.in);
			System.out.print("Ten:");
			them.setTen(input2.nextLine());
			System.out.print("Dia chi:");
			them.setDiaChi(input2.nextLine());
			System.out.print("Diem mon 1:");
			them.setDiemMonHoc1(input2.nextDouble());
			System.out.print("Diem mon 2:");
			them.setDiemMonHoc2(input2.nextDouble());
			danhSach.add(them);
		} catch (Exception e) {
			System.out.println("Loi!!!");
			e.printStackTrace();
			return;
		}
	}

	public void themKhachHang() {
		KhachHang them = new KhachHang();
		try {
			Scanner input3 = new Scanner(System.in);
			System.out.print("Ten:");
			them.setTen(input3.nextLine());
			System.out.print("Dia chi:");
			them.setDiaChi(input3.nextLine());
			System.out.print("Nganh Hang:");
			them.setNganhHang(input3.nextLine());
			System.out.print("So Luong:");
			them.setSoLuong(input3.nextInt());
			System.out.print("Don Gia:");
			them.setDonGia(input3.nextDouble());
			danhSach.add(them);
		} catch (Exception e) {
			System.out.println("Loi!!!");
			e.printStackTrace();
			return;
		}
	}

	public void xoaNguoi() {
		String xoa;
		try {
			Scanner input4 = new Scanner(System.in);
			System.out.println("Nhap ten nguoi muon xoa:");
			xoa = input4.nextLine();
			for (int i = 0; i < danhSach.size(); i++) {
				if (danhSach.get(i).getTen().equals(xoa)) {
					danhSach.remove(i);
				}
			}
		} catch (Exception e) {
			System.out.println("Loi!!!");
			e.printStackTrace();
			return;
		}
	}

	public void xuatNhanVien(NhanVien nvXuat) {
		System.out.println("Ten: " + nvXuat.getTen() + " DiaChi: "
				+ nvXuat.getDiaChi() + " HeSoluong: " + nvXuat.getHeSoLuong()
				+ " ChucVu: " + nvXuat.getChucVu());
	}

	public void xuatSinhVien(SinhVien svXuat) {
		System.out.println("Ten: " + svXuat.getTen() + " DiaChi: "
				+ svXuat.getDiaChi() + " DiemMon1: "
				+ svXuat.getDiemMonHoc1() + " DiemMon2: "
				+ svXuat.getDiemMonHoc2());
	}

	public void xuatKhachHang(KhachHang khXuat) {
		System.out.println("Ten: " + khXuat.getTen() + " DiaChi: "
				+ khXuat.getDiaChi() + " NganhHang: " + khXuat.getNganhHang()
				+ " SoLuong: " + khXuat.getSoLuong() + " DonGia: "
				+ khXuat.getDonGia());

	}

	public void xuatThongTin() {
		for (int i = 0; i < danhSach.size(); i++) {
			if (danhSach.get(i) instanceof NhanVien) {
				xuatNhanVien((NhanVien) danhSach.get(i));
			}
			if (danhSach.get(i) instanceof SinhVien) {
				xuatSinhVien((SinhVien) danhSach.get(i));
			}
			if (danhSach.get(i) instanceof KhachHang) {
				xuatKhachHang((KhachHang) danhSach.get(i));
			}
		}
	}

	public void sapXep() {
		Collections.sort(danhSach, new Comparator<ThongTinConNguoi>() {
			@Override
			public int compare(ThongTinConNguoi n1, ThongTinConNguoi n2) {
				return (n1.getTen().compareToIgnoreCase(n2.getTen()));
			}
		});
		for (int i = 0; i < danhSach.size(); i++) {
			System.out.println("Ho ten: " + danhSach.get(i).getTen());
		}
	}
}
