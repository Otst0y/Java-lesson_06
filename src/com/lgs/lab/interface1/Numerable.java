package com.lgs.lab.interface1;

public interface Numerable extends Plus, Minus, Multiply, Divide {
	
	void add(int a, int b);
	void substract(int a, int b);
	void multiply(int a, int b);
	void divide(int a, int b);
}
