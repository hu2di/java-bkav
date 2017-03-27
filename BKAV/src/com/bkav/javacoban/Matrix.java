package com.bkav.javacoban;

import java.util.Scanner;

public class Matrix {
	public static void main(String args[]){
		final int MAX=100;
		Scanner sc=new Scanner(System.in);
		int n=0,m=0,i=0,j=0;
		int arrInt[][]=new int[MAX][MAX];
		//Nhap ma tran
		try{
			System.out.print("Nhap so dong: ");
			n=sc.nextInt();
			System.out.print("Nhap so cot: ");
			m=sc.nextInt();
		}catch(Exception e){
			System.out.println("Nhap sai");
		}
		try{
			System.out.println("Nhap ma tran");
			for (i=0;i<n;i++){
				for(j=0;j<m;j++){
					System.out.print("A["+(i+1)+"]["+(j+1)+"]= ");
					arrInt[i][j]=sc.nextInt();
				}
			}
		}catch(Exception e){
			System.out.println("Nhap sai!");
		}
		//In ma tran
		inMaTran(arrInt, n, m);
		//Tim phan tu lon nhat va chi so
		int max=arrInt[0][0],phang=0,pcot=0;
		for (i=0;i<n;i++){
			for(j=0;j<m;j++){
				if (arrInt[i][j]>max){
					max=arrInt[i][j];
				}
			}
		}
		for (i=0;i<n;i++){
			for(j=0;j<m;j++){
				if (arrInt[i][j]==max){
					phang=i+1;
					pcot=j+1;
					System.out.println("Phan tu lon nhat: "+max+" chi so hang: "+phang+" chi so cot: "+pcot);
				}
			}
		}
		//In ma tran nguyen to
		for (i=0;i<n;i++){
			for(j=0;j<m;j++){
				if (nguyenTo(arrInt[i][j])==false){
					arrInt[i][j]=0;
				}
			}
		}
		inMaTran(arrInt, n, m);
		System.out.println("So Nguyen To");
		//Tim hang nhieu so nguyen to nhat
		int dMax=0;
		for (i=0;i<n;i++){
			int dTam=0;
			for(j=0;j<m;j++){
				if (arrInt[i][j]!=0){
					dTam++;
				}
			}
			if (dTam>dMax){
				dMax=dTam;
			}
		}
		System.out.println("Hang nhieu so nguyen to nhat la hang: ");
		for (i=0;i<n;i++){
			int dTam=0;
			for(j=0;j<n;j++){
				if (arrInt[i][j]!=0){
					dTam++;
				}
			}
			if (dTam==dMax){
				System.out.print(" "+(i+1)+" ");
			}
		}
		sc.close();
	}
	//Phuong thuc in ma tran
	public static void inMaTran(int a[][],int n,int m){
		System.out.println();
		System.out.println("Ma Tran");
		for (int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(a[i][j]+" ");
				if(j==(m-1)){
					System.out.println();
				}
			}
		}
	}
	//Phuong thuc kiem tra so nguyen to
	public static boolean nguyenTo(int n){
		if (n==1) return false;
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0) return false;
		}
		return true;
	}
}
