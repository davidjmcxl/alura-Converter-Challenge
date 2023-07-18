package conversores;

public class ConvertToPeso {
	private double pesoToConvert;
	public ConvertToPeso(double pesoToConvert) {
		this.pesoToConvert = pesoToConvert;
	}
	public double getpesoToConvert() {
		return pesoToConvert;
	}
	
	
	public double convertToPeso(int opc) {
		switch(opc) {
		case 1:
			//Dollar USD
			return this.getpesoToConvert()*4009.53;
		case 2:
			//Euro EUR
			System.out.println(this.getpesoToConvert());
			return this.getpesoToConvert()*4504.89;
		case 3:
			//Yen Japones (JPY)
			return this.getpesoToConvert()*28.87;
		case 4:
			//libra esterlina (GBP)
			return this.getpesoToConvert()*5233.11;
		case 5:
			//Dollar Australiano (AUD)
			return this.getpesoToConvert()*2732.18;
		case 6:
			//Dollar canadiense (CAD)
			return this.getpesoToConvert()*3045.20;
		case 7:
			//// franco suizo(CHF)
			return this.getpesoToConvert()*4677.60;
		case 8:
			//Rublo Ruso – RUB
			return this.getpesoToConvert()*44.26;
		case 9:
			//Yuan Chino – CNY
			return this.getpesoToConvert()*557.70;
		case 10:
			//Árabes Unidos – AED
			return this.getpesoToConvert()*0.00091;
		default:
		    return this.getpesoToConvert()*2;
		}
		
		 
	}
}
