package com.bkav.javacoban;

import java.util.Scanner;

public class ArraryInt {
	public static void main(String args[]){
		final int AMAX=100;
		Scanner sc=new Scanner(System.in);
		int n=0;
		try{
			System.out.print("Nhap so phan tu cua mang: ");
			n=sc.nextInt();
		}catch(Exception e){
			System.out.println("Nhap sai!");
		}
		int arrInt[]=new int[AMAX];
		try{
			System.out.println("Nhap vao tung phan tu cua mang (0..100): ");
			for(int i=0;i<n;i++){
				System.out.print("arrInt["+i+"]= ");
				arrInt[i]=sc.nextInt();
			}
		}catch(Exception e){
			System.out.println("Nhap sai!");
		}
		int max=arrInt[0],pmax=0;
		for(int i=0;i<n;i++){
			if (max<arrInt[i]){
				max=arrInt[i];
				pmax=i;
			}
		}
		System.out.println("Phan tu lon nhat: "+max+" va chi so: "+pmax);
		int max2=-1,pmax2=-1;
		for(int i=0;i<n;i++){
			if ((max2<arrInt[i])&&(arrInt[i]<max)){
				max2=arrInt[i];
				pmax2=i;
			}
		}
		System.out.println("Phan tu lon thu hai: "+max2+" va chi so: "+pmax2);
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arrInt[i]>arrInt[j]){
					temp=arrInt[i];
					arrInt[i]=arrInt[j];
					arrInt[j]=temp;
				}
			}
		}
		System.out.println("Sap xep giam dan:");
		for (int i=0;i<n;i++){
			System.out.print(arrInt[i]+" ");
		}
		System.out.println();
		int x=0;
		try{
			System.out.println("Nhap so can chen x: ");
			x=sc.nextInt();
		}catch(Exception e){
			System.out.println("Nhap sai");
		}
		for (int i=0;i<n;i++){
			if ((x<=arrInt[i])&&(x>arrInt[i+1])){
				for(int j=n;j>i+1;j--){
					arrInt[j]=arrInt[j-1];
				}
				arrInt[i+1]=x;
				break;
			}
		}
		System.out.println("Sau khi chen:");
		for (int i=0;i<=n;i++){
			System.out.print(arrInt[i]+" ");
		}
		sc.close();
	}
}
