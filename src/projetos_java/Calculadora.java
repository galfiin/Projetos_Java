package projetos_java;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o Primeiro Numero: ");
		double num1 = sc.nextDouble();
		System.out.print("Digite o Primeiro Numero: ");
		double num2 = sc.nextDouble();
		System.out.print("Digite um operador matemático: (+, -, *, /): ");
		char operador = sc.next().charAt(0);
		sc.close();
		
		double result;
		
		switch (operador) {
			case '+': 
				result = num1 + num2;
				break;
			case '-': 
				result = num1 - num2; 
				break; 
			case '*': 
				result = num1 * num2; 
				break;
			case '/': 
				result = num1 % num2;
				break;
			default: 
				System.out.println("Operação Invalida");
			return; 
		}
		System.out.println(num1 + " " + operador + " " + num2 + ": " + result);
	}
}
