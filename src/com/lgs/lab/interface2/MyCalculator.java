package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{

	@Override
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	@Override
	public void substract(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println(a * b);
	}

	@Override
	public void divide(int a, int b) {
		System.out.println(a / b);
	}

	public static void main(String[] args) {
		
		MyCalculator calculate = new MyCalculator();
		
		calculate.multiply(395, 738);
		calculate.substract(10, 5);
		calculate.add(65, 21);
		calculate.divide(21, 7);
		
		
	}
}
