package com.bkav.javacoban;

import java.util.Scanner;

public class VietTienBangChu {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int tien=0;
		System.out.print("Nhap menh gia tien: ");
		tien=sc.nextInt();
		int giaTri=tien/1000;
		System.out.println(tien+" : "+numToText(giaTri)+" Nghin Dong!");
		sc.close();
		
	}
	
	public static String numToText(int n){
		String str=new String();
		switch(n){
		case 1:
			str="Mot";
			break;
		case 2:
			str="Hai";
			break;
		case 3:
			str="Ba";
			break;
		case 4:
			str="Bon";
			break;
		case 5:
			str="Nam";
			break;
		case 6:
			str="Sau";
			break;
		case 7:
			str="Bay";
			break;
		case 8:
			str="Tam";
			break;
		case 9:
			str="Chin";
			break;
		case 10:
			str="Muoi";
			break;
		case 100:
			str="Mot tram";
			break;
		case 500:
			str="Nam tram";
			break;
		default:
			break;
		}
		return str;
	}
}
