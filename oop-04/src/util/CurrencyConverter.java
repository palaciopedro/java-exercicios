package util;

public class CurrencyConverter {

	public static double amountToBePaid(double dolarPrice, double quantity) {
		return dolarPrice * quantity * 1.06;
	}
}