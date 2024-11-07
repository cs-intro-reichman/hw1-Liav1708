// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];

		int Bill = Integer.parseInt(args[3]);
		double NewBill = (double)(Bill);
		NewBill = NewBill / 3;                 // dividing the bill
		double FinalBill = Math.ceil(NewBill); // rounding the bill

		System.out.println("hello " + name1 + " " + name2 + " " + name3 +
		 " your bill is : " + Bill + " please pay " + FinalBill + " each");

	}
}
