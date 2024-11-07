// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		
		int lim = Integer.parseInt(args[0]);

		int a = (int) (Math.random() * ((double)(lim) + 1.0));
		int b = (int) (Math.random() * ((double)(lim) + 1.0));
		int c = (int) (Math.random() * ((double)(lim) + 1.0)); //genrating three random numbers from 0 - lim

		System.out.println(a + " " + b + " " + c);

		int max = Math.max(a , Math.max(b, c));  // finding the biggest number
		int min = Math.min(a , Math.min(b, c));  // finding the smallest number

		int check1 = Math.max(a, b);
		int check2 = Math.max(b,c);
		int check3 = Math.max(a,c);  //holding temporary checks


		int mid = Math.min(check1, Math.min(check2, check3));  // finding the middle number

		System.out.println(min + " " + mid + " " + max);
	}


}
