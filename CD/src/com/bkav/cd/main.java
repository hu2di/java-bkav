package com.bkav.cd;

import java.util.Scanner;
import java.util.Vector;

import javax.swing.JFrame;

public class main {
	public static void main(String args[]) {
		Collection col = new Collection();
		boolean kt = true;
		while (kt) {
			System.out.println();
			System.out
					.println("---------------------------------------------------------------------------------------------");
			System.out.print("1.THEM!  ");
			System.out.print("2.TIMKIEM!  ");
			System.out.print("3.DANHSACH!  ");
			System.out.println("4.THOAT!  ");
			System.out
					.println("---------------------------------------------------------------------------------------------");
			int key;
			Scanner keyboard = new Scanner(System.in);
			key = keyboard.nextInt();
			switch (key) {
			case 1: {
				col.themCD();
				break;
			}
			case 2: {
				col.timKiem();
				break;
			}
			case 3: {
				col.inDanhSach();
				break;
			}
			case 4: {
				kt = false;
				keyboard.close();
				break;
			}
			default: {
				System.out.println("Nhap sai!");
				break;
			}
			}
		}
	}
}
