package SimplesCalculadora;

import java.util.Date;
import java.util.Scanner;

public class Calculadora1 {
	
	//UTILIZANDO SCANNER

		public static void main(String[] args) {
			
			int numero1;
			int numero2;
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Informe o primeiro número: ");
			numero1 = teclado.nextInt();
			System.out.println("Informe o segundo número: ");
			numero2 = teclado.nextInt();
			
			System.out.println("Soma: "+(numero1+numero2));
			System.out.println("Subtração: "+(numero1-numero2));
			System.out.println("Multiplicação: "+(numero1*numero2));
			System.out.println("Divisão: "+(numero1/numero2));
			
			teclado.close();
			
			System.out.println(); 
			
			Date x= new Date();
			System.out.println(x);
			
		}

	}
