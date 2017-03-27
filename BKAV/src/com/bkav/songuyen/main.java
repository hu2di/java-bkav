package com.bkav.songuyen;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String args[]){
        int n=0;
        System.out.println("Nhap n = ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        SoNguyen soNguyen[] = new SoNguyen[n];
        int i=0, randomNumber=0;
        for (i=0;i<n;i++){
            soNguyen[i] = new SoNguyen();
            randomNumber = new Random().nextInt(100)+1;
            soNguyen[i].setValue(randomNumber);
        }
        for (i=0;i<n;i++){
            System.out.print(" "+soNguyen[i].getValue());
        }
        int min=soNguyen[0].getValue();
        for (i=0;i<n;i++){
            if (min>soNguyen[i].getValue()){
                min=soNguyen[i].getValue();
            }
        }
        System.out.println();
        System.out.println("Phan tu nho nhat trong mang:"+min);
    }
}
