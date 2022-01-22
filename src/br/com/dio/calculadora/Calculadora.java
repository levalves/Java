package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro Valor:");
		a = scan.nextInt();
		System.out.println("Digite o segundo  Valor:");
		b = scan.nextInt();
		
		int adicao = adicao(a,b);
		int subtracao = subtracao(a,b);
		int multipliacao = multipliacao(a,b);
		float divisao = divisao(a,b);
		System.out.println("Soma        : " + adicao);
		System.out.println("Subtracao   : " + subtracao);
		System.out.println("multipliacao: " + multipliacao);
		System.out.println("Divisao     : " + divisao);
		
}

	public static int adicao(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multipliacao(int a, int b) {
		return a * b;
	}
	public static float divisao(float a, float b) {
		return a / b;
	}
}
