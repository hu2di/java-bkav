package com.bkav.shape;

public class Rectangle implements Shape {
	public double x1, x2, y1, y2;

	@Override
	public void draw() {
		System.out.println("Ve hinh chu nhat");		
	}

	@Override
	public void erase() {
		System.out.println("Xoa hinh chu nhat");		
	}

	@Override
	public void translate(int dx, int dy) {
		System.out.println("Di chuyen hinh chu nhat");		
	}
}
