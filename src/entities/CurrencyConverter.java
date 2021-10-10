package entities;

public class CurrencyConverter {
 
	public static double IOF = 0.06;
	
	public static double dollarParaReal (double montante, double dollarPreco) {
		return montante * dollarPreco * (1.0 + IOF);
	}
}
