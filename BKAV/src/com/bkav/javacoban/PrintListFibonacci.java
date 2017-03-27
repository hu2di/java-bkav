package com.bkav.javacoban;

public class PrintListFibonacci {
	public static void main(String args[]){
		if(args!=null){
			int n=Integer.parseInt(args[0]);
			printListFibonacci(n);
		}
	}
	
	private static int fibo(int n){
		if (n<=2){
			return 1;
		}
		return fibo(n-1)+fibo(n-2);
	}
	
	private static void printListFibonacci(int n){
		for (int i=1;i<=n;i++){
			int fi=fibo(i);
			System.out.println(fi+" ");
		}
	}
}
