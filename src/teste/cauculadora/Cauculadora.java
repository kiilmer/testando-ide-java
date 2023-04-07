package teste.cauculadora;

import java.util.Scanner;

public class Cauculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();	
		
		double soma = soma(a,b); 
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
	
		System.out.println(soma);
		System.out.println(subtracao);	
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
	}

	public static double soma(int a, int b) {
		return a + b;
	}
    
	public static double subtracao(int a, int b) {
	return a - b;
    
	}
	
	public static double divisao(double a, double b) {
		return a / b;
	}
	
	public static double multiplicacao(double a, double b) {
		return a * b;
	}
	
}