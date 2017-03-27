package com.bkav.shape;

public class Triangle implements Shape {
	public double xA, xB, xC, yA, yB, yC;

	@Override
	public void draw() {
		System.out.println("Ve hinh tam giac");		
	}

	@Override
	public void erase() {
		System.out.println("Xoa hinh tam giac");		
	}

	@Override
	public void translate(int dx, int dy) {
		System.out.println("Di chuyen tam giac");		
	}
}
