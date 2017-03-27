package com.bkav.shape;

public class Polygon implements Shape {
	public java.awt.Point[] p;
	
	@Override
	public void draw() {
		System.out.println("Ve hinh da giac");		
	}

	@Override
	public void erase() {
		System.out.println("Xoa hinh da giac");		
	}

	@Override
	public void translate(int dx, int dy) {
		System.out.println("Di chuyen hinh da giac");		
	}
}
