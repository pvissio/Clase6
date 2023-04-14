package main;

public class Calculadora {
	
	private double num1;
	private double num2;
	private double resultado;
	
	
	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	
	
	public double sumar(double num1, double num2) {
		resultado= 0;
		resultado = num1 + num2;
		return resultado;
	}
	
	public double restar(double num1, double num2) {
		resultado= 0;
		resultado = num1 - num2;
		return resultado;
	}
	
	public double multiplicar(double num1, double num2) {
		resultado= 0;
		resultado = num1 * num2;
		return resultado;
	}
	
	public double dividir(double num1, double num2) {
		resultado= 0;
		if (num2!=0) {
			resultado = num1 / num2;
		}
		return resultado;
	}
	
}