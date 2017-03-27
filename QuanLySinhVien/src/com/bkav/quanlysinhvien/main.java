package com.bkav.quanlysinhvien;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		QuanLy quanLySV = new QuanLy();
		
		int key = 0;
		int keyboard = 0;
		while (key == 0) {
			System.out.println();
			System.out
					.println("---------------------------------------------------------------------------------------------");
			System.out.print("1.THEMSINHVIENTRUNGCAP!  ");
			System.out.print("2.THEMSINHVIENCAODANG!  ");
			System.out.print("3.THEMSINHVIENDAIHOC!  ");
			System.out.print("4.THEMSINHVIENLIENKET!  ");
			System.out.print("5.XOASINHVIEN!  ");
			System.out.print("6.TIMKIEMSINHVIEN!  ");
			System.out.print("7.INDANHSACH!  ");
			System.out.println("8.THOAT!  ");
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
				System.out.println("___THEM SINH VIEN TRUNG CAP___");
				quanLySV.nhapSinhVienTrungCap();
				break;
			}
			case 2: {
				System.out.println("___THEM SINH VIEN CAO DANG___");
				quanLySV.nhapSinhVienCaoDang();
				break;
			}
			case 3: {
				System.out.println("___THEM SINH VIEN DAIHOC___");
				quanLySV.nhapSinhVienDaiHoc();
				break;
			}
			case 4: {
				System.out.println("___THEM SINH VIEN LIEN KET___");
				quanLySV.nhapSinhVienLienKet();
				break;
			}
			case 5: {
				System.out.println("___XOA SINH VIEN___");
				quanLySV.xoaSinhVien();
				break;
			}
			case 6: {
				System.out.println("___TIM KIEM SINH VIEN___");
				quanLySV.xuatThongTinSinhVien();
				break;
			}
			case 7: {
				System.out.println("___IN DANH SACH___");
				quanLySV.hienThiDanhSach();
				break;
			}
			case 8: {
				key = 1;
				break;
			}
			default: {
				System.out.println("Chon sai!");
				break;
			}
			}
		}
		input.close();
	}
}
