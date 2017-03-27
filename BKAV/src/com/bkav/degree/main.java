package com.bkav.degree;

import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = 3;
		Degree sv[] = new Degree[n];
		// Nhap doi tuong
		System.out.println("Nhap " + n + " doi tuong!");
		for (int i = 0; i < n; i++) {
			sv[i] = new Degree();
			try {
				System.out.println("Sinh vien " + (i+1) + ":");
				System.out.println("Name:");
				sv[i].setName(input.next());
				System.out.println("Descipline:");
				sv[i].setDiscipline(input.next());
				System.out.println("University:");
				sv[i].setUniversity(input.next());
				System.out.println("Date Awarded:");
				sv[i].setDateAwarded(input.nextInt());
			} catch (Exception e) {
				System.out.println("Loi!");
				break;
			}
		}

		// Sap Xep Theo Date Awarded
		Degree temp = new Degree();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (sv[i].getDateAwarded() > sv[j].getDateAwarded()) {
					temp = sv[i];
					sv[i] = sv[j];
					sv[j] = temp;
				}
			}
		}

		// In ra
		for (int i = 0; i < n; i++) {
			System.out.println("Name: " + sv[i].getName() + " DateAwarded: "
					+ sv[i].getDateAwarded());
		}
	}
}
