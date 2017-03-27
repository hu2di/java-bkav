package com.bkav.quanlyhocvien;

import java.util.Scanner;

public class Run {

	public static void main(String args[]) {
		int key = 0, keyboard = 0;
		;
		Scanner input = new Scanner(System.in);
		QuanLy quanLy = new QuanLy();
		while (key == 0) {
			System.out.println();
			System.out
					.println("---------------------------------------------------------------------------------------------");
			System.out.print("1.THEMNHANVIEN!  ");
			System.out.print("2.THEMSINHVIEN!  ");
			System.out.print("3.THEMKHACHHANG!  ");
			System.out.print("4.XOA!  ");
			System.out.print("5.SAPXEP!  ");
			System.out.print("6.INDANHSACH!  ");
			System.out.println("7.THOAT!  ");
			System.out
					.println("---------------------------------------------------------------------------------------------");
			try {
				keyboard = input.nextInt();
			} catch (Exception e) {
				System.out.println("Loi!!!");
				e.printStackTrace();
			}
			switch (keyboard) {
			case 1: {
				System.out.println("___THEMNHANVIEN___");
				quanLy.themNhanVien();
				break;
			}
			case 2: {
				System.out.println("___THEMSINHVIEN___");
				quanLy.themSinhVien();
				break;
			}
			case 3: {
				System.out.println("___THEMKHACHHANG___");
				quanLy.themKhachHang();
				break;
			}
			case 4: {
				System.out.println("___XOA___");
				quanLy.xoaNguoi();
				break;
			}
			case 5: {
				System.out.println("___SAP XEP___");
				quanLy.sapXep();
				break;
			}
			case 6: {
				System.out.println("___IN THONG TIN___");
				quanLy.xuatThongTin();
				break;
			}
			case 7: {
				key = 1;
				break;
			}
			default: {
				System.out.println("Chon sai!");
				break;
			}
			}
		}
		quanLy.ghiFile();
		input.close();
	}
}
