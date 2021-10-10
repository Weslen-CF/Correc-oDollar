package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("What is the dollar price? ");
	   double dollarPreco = sc.nextDouble();
	   System.out.print("How many dollars will be bought? ");
	   double montante = sc.nextDouble();
	   double resultado = CurrencyConverter.dollarParaReal(montante, dollarPreco);
	   System.out.printf("Amount to be paid in reais = %.2f%n", resultado);
	 
	   
	   
	   
	   
	   sc.close();
	}

}
