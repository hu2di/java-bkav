package com.bkav.javacoban;

import java.util.Scanner;

public class TongCacChuSo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int soNguyen = 0, tongChuSo = 0;
		System.out.println("Nhap so nguyen: ");
		soNguyen = sc.nextInt();
		int temp = soNguyen;
		while (temp != 0){
			tongChuSo = tongChuSo + temp%10;
			temp = temp/10;
		}
		System.out.println("Tong cac chu so cua "+soNguyen+" la: "+tongChuSo);
		sc.close();
	}
}