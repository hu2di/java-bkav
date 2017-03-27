package com.bkav.cd;

import java.util.Scanner;

public class Collection {
	private int soLuongCD = 0;
	private double tongGia = 0;
	CD collection[] = new CD[100];

	public void themCD() {
		collection[soLuongCD] = new CD();
		try {
			Scanner input = new Scanner(System.in);
			System.out.print("\nMa CD: ");
			collection[soLuongCD].setMaCD(input.nextInt());
			input.nextLine();
			System.out.print("\nTen CD: ");
			collection[soLuongCD].setTenCD(input.nextLine());
			System.out.print("\nCa Si: ");
			collection[soLuongCD].setCaSi(input.nextLine());
			System.out.print("\nSo Luong Bai Hat: ");
			collection[soLuongCD].setSoBaiHat(input.nextInt());
			System.out.print("\nGia Thanh: ");
			collection[soLuongCD].setGiaThanh(input.nextDouble());
			tongGia = tongGia + collection[soLuongCD].getGiaThanh();
			soLuongCD++;
			//input.close();
		} catch (Exception e) {
			System.out.println("Loi!");
			e.printStackTrace();
		}
	}

	public void inDanhSach() {
		for (int i = 0; i < soLuongCD; i++) {
			System.out.println(collection[i].toString() + "\n");
		}
	}

	public void timKiem() {
		CD tim = new CD();
		try {
			Scanner in = new Scanner(System.in);
			System.out.print("Nhap ten CD can tim: ");
			tim.setTenCD(in.nextLine());
			//in.close();
		} catch (Exception e) {
			System.out.println("Loi!");
			e.printStackTrace();
		}
		boolean kt = false;
		for (int i = 0; i < soLuongCD; i++) {
			if (collection[i].equals(tim)==true) {
				kt = true;
				System.out.println(collection[i].toString());
			}
		}
		if (kt == false) {
			System.out.println("Khong tim thay!");
		}
	}
}
