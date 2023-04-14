package main;

public class main {

	public static void main(String[] args) {
		
		Calculadora cassio = new Calculadora();
		cassio.multiplicar(80, 3);
		System.out.println("El resultado de multiplicar 80 por 3 da " + cassio.multiplicar(80, 3));
		cassio.dividir(cassio.sumar(150, 180), 3);
		System.out.println("El resultado de sumar 150 y 180, dividido por 3, da " + cassio.dividir(cassio.sumar(150, 180), 3));
		
	}

}