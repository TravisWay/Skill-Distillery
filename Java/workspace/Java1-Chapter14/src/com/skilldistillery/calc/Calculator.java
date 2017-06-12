package com.skilldistillery.calc;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public int add(int i1, int i2){		
		return i1 + i2;
		
		
	}
	public int sub(int i1, int i2){		
		return i1 - i2;
	}
	
	public int mult(int i1, int i2){		
		return i1 * i2;
	}
	
	public int divInt(int i1, int i2){		
		int result = -1;
		try {
			result = i1/i2;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			throw new CannotDoThatException(e);
		}
		return result;
	}
	public double divDou(Double i1, double i2){		
		return i1 / i2;
	}
	
	
	
}
