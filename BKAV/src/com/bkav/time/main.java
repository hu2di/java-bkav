package com.bkav.time;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		Date d1 = new Date();
		Date d2 = new Date();
		try {
			System.out.println("Nhap ngay 1:");
			System.out.println("Ngay:");
			d1.setDd(input.nextInt());
			System.out.println("Thang:");
			d1.setMm(input.nextInt());
			System.out.println("Nam:");
			d1.setYy(input.nextInt());
			System.out.println("Nhap ngay 2:");
			System.out.println("Ngay:");
			d2.setDd(input.nextInt());
			System.out.println("Thang:");
			d2.setMm(input.nextInt());
			System.out.println("Nam:");
			d2.setYy(input.nextInt());
		} catch (Exception e) {
			System.out.println("Loi!");
		}
		if (d1.kiemTra() == true && d2.kiemTra() == true) {
			int khoangCach = 0;
			khoangCach = Math.abs(d1.getYy() - d2.getYy()) * 365;
			System.out.println("Khoang cach giua hai ngay la:" + khoangCach);
		} else {
			System.out.println("Nhap sai ngay!");
		}

		input.close();
	}
}
