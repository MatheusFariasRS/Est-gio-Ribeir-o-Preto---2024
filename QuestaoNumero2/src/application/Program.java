package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
	        int numero = sc.nextInt();

	        if (verificaFibonacci(numero)) {
	            System.out.println(numero + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println(numero + " não pertence à sequência de Fibonacci.");
	        }

	        sc.close();
	    }

	    public static boolean verificaFibonacci(int numero) {
	        int a = 0;
	        int b = 1;

	        while (b < numero) {
	            int temp = b;
	            b += a;
	            a = temp;
	        }

	        return b == numero;
	    }
	}

