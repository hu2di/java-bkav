package com.bkav.javacoban;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
		int n;
		System.out.println("Nhap so phan tu:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arrInt[] = new int[n];
		System.out.println("Nhap tung phan tu:");
		for (int i=0;i<n;i++){
			System.out.println("arrInt["+i+"]=");
			arrInt[i]=sc.nextInt();
		}
		int temp = 0;
		for (int i=0;i<n;i++){
			for (int j=0;j<n;j++){
				if (arrInt[i]<arrInt[j]){
					temp = arrInt[i];
					arrInt[i]=arrInt[j];
					arrInt[j]=temp;
				}
			}
		}
		System.out.println("Sap xep:");
		for (int i=0;i<n;i++){
			System.out.print(" "+arrInt[i]);
		}
		sc.close();
    }
}