package com.bkav.javacoban;

import java.util.Scanner;

public class PhanTichThuaSoNguyenTo {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int intNhap = 0;
		try {
			System.out.print("Nhap so can phan tich: ");
			intNhap = sc.nextInt();
		} catch (Exception e) {
			System.out.println("Nhap sai!");
		}
		if (intNhap == 0 || intNhap == 1) {
			System.out.println(intNhap + " = " + intNhap);
		} else if (intNhap < 0) {
			System.out.println("Nhap sai!");
		} else {
			int i = 2;
			System.out.print(intNhap + " = ");
			do {
				if (intNhap % i == 0) {
					System.out.print(i);
					intNhap = intNhap / i;
					if (intNhap > 1)
						System.out.print(" * ");
				} else
					i++;
			} while (intNhap != 1);
		}
		sc.close();
	}
}
