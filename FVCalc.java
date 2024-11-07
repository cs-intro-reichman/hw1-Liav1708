// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		
		int value = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);

		System.out.println(value + " " + rate + " " + years);

		double newRate = (double)(rate);
		double newYears = (double)(years);
		double newValue = (double)(value);

		newRate = Math.pow(((newRate / 100.0) + 1), newYears); // calculating new rate
		newValue = newValue * newRate ; // calculating new value

		System.out.println("After " + years + " years, $" + value + " saved at " 
		+ (double) (rate) + "% will yeild $" + (int) (newValue));
	

		
	}
}