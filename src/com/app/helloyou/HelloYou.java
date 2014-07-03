package com.app.helloyou;

public class HelloYou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c;
		long d,e,f;
		double g,h;
		float i;
		
		String myString= "\nHello there you!\n"; 
		// String myOtherString = "What now";

		a = 1;
		b = 2;
		c = a + b + 3;
		System.out.print("C is: ");
		System.out.println(c);
		
		
		d = 100;
		e = 200;
		f = d + e + 300;
		System.out.print("f is: ");
		System.out.println(f);

		if (a == c) {
			c--;
		}

		i = 1;
		if (i < a){
			System.out.println("Less than value 'a'\n");
		}
		else {
			System.out.println("Greater than value 'a'\n");
		}
			

		c = b * a;

		while (a < 10) {
		System.out.print(a++);
		}

		System.out.println(myString);
		System.out.print("end");

	} // end main method

} // end class
