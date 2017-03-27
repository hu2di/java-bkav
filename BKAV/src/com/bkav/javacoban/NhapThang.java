package com.bkav.javacoban;

import java.util.Scanner;

public class NhapThang{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int month = 0;
		System.out.println("Nhap thang: ");
		month = sc.nextInt();
		switch (month){
			case 1:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 3:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 5:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 7:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 8:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 10:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 12:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 4:
				System.out.println("Thang "+month+" co 30 ngay!");
				break;
			case 6:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 9:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 11:
				System.out.println("Thang "+month+" co 31 ngay!");
				break;
			case 2: 
				System.out.println("Thang "+month+" co 28 hoac 29 ngay!");
				break;
			default: 
				System.out.println("Nhap sai!");
				break;
		}
		sc.close();
	}
}