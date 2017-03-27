package com.bkav.javacoban;


public class SoChan{
	public static void main(String args[]){
		int tongSoChan = 0;
		System.out.println("Cac so chan tu 1 den 200:");
		for (int i = 2; i<= 200; i = i+2){
			System.out.print(" "+i);
			tongSoChan = tongSoChan + i;
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Tong cac so chan tren la "+tongSoChan);
		System.out.println();
		System.out.println("Sap xep giam dan: ");
		for (int i=200; i>1; i = i--)
			System.out.print(" "+i);
	}
}
