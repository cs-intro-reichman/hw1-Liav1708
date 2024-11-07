// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    

		int number = Integer.parseInt(args[0]);

		int hundreds = number / 100;  //extracting the hundreds

		number = Math.floorMod(number, 1000); // making sure we checking from the hunderds digit

		int tens = Math.floorDiv(Math.floorMod(number, 100), 10); // extracting the tens
		int ones = Math.floorDiv(Math.floorMod(Math.floorMod(number, 100), 10), 1); // extracting the ones

		System.out.println(hundreds + " hundreds, " + tens + " tens, and " + ones + " ones.");


		
		



	}
}
