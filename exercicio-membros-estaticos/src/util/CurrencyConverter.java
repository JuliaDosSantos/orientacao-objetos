package util;

public class CurrencyConverter {
	
	public static double VALOR_IOF = 0.06;
	
	public static double valorFinal(double cotacao, double quantDolares) {
		return cotacao * quantDolares * (1.0 + VALOR_IOF);
	}

}
