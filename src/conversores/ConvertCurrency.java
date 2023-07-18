package conversores;

public class ConvertCurrency {
	private double currencyToConvert;
	public ConvertCurrency(double currencyToConvert) {
		this.currencyToConvert = currencyToConvert;
	}
	public double getCurrencyToConvert() {
		return currencyToConvert;
	}
	
	
	public double convertToCurrencies(int opc) {
		switch(opc) {
		case 1:
			//Dollar USD
			return this.getCurrencyToConvert()*0.00025;
		case 2:
			//Euro EUR
			return (this.getCurrencyToConvert()*0.00022003);
		case 3:
			//Yen Japones (JPY)
			return this.getCurrencyToConvert()*0.03458;
		case 4:
			//libra esterlina (GBP)
			return this.getCurrencyToConvert()*0.00018885;
		case 5:
			//Dollar Australiano (AUD)
			return this.getCurrencyToConvert()*0.00036083;
		case 6:
			//Dollar canadiense (CAD)
			return this.getCurrencyToConvert()*0.00031717;
		case 7:
			// franco suizo(CHF)
			return this.getCurrencyToConvert()*0.00021537;
		case 8:
			//Rublo Ruso – RUB
			return this.getCurrencyToConvert()*0.02099;
		case 9:
			//Yuan Chino – CNY
			return this.getCurrencyToConvert()*0.001738;
		case 10:
			//Árabes Unidos – AED
			return this.getCurrencyToConvert()*0.00087843;
		default:
		    return this.getCurrencyToConvert()*2;
		}
		
		 
	}
	
}
