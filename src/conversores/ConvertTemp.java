package conversores;

public class ConvertTemp {
	private double temp;
	public ConvertTemp() {
		
	}
	public ConvertTemp(double temp) {
		this.temp=temp;
	}
	public double convertToFarenheit() {
		double tempF=0.0;
		System.out.println(this.temp);
		return tempF=(this.temp*9/5	)+32;
	}
	public double convertToCelsius() {
		double tempC=0.0;
		
		return tempC=(this.temp-32)*5/9 ;
	}
}
