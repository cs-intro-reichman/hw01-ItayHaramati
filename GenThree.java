/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[0]);
		int randomnum1 = a + (int)(Math.random() * ((b - a) + 1));
		int randomnum2 = a + (int)(Math.random() * ((b - a) + 1));
		int randomnum3 = a + (int)(Math.random() * ((b - a) + 1));
		System.out.println(randomnum1);
		System.out.println(randomnum2);
		System.out.println(randomnum3);
		System.out.println("The minimal generated number was " + a);

	}
}
