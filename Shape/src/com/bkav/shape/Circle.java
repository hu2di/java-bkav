package com.bkav.shape;

public class Circle implements Shape {
	public double xc, yc, r;

	@Override
	public void draw() {
		System.out.println("Ve hinh tron");		
	}

	@Override
	public void erase() {
		System.out.println("Xoa hinh tron");		
	}

	@Override
	public void translate(int dx, int dy) {
		System.out.println("Di chuyen hinh tron");		
	}
	
}
