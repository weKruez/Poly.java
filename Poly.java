public class Poly {
	public static void main (String[] args){
		//This is user input for 3 cubic roots
		System.out.println ("Enter an integer:");
			int num1 = (IO.readInt() * -1);
		System.out.println("Enter another integer:");
			int num2 = (IO.readInt() * -1);
		System.out.println("Enter another integer:");
			int num3 = (IO.readInt() * -1);
			//This declares the variables of each expression x to the coefficent of 1
					int x1 = 1;
					int x2 = 1;
					int x3 = 1;
					// This multiplies the first 2 expressions
						int polyfirst = (x1 * x2);
						int polyouter = (x1 * num2);
						int polyinner = (x2 * num1);
						int polylast = (num1 * num2);
						int poly = (polyinner + polyouter);							
						//This is the first term of the cubic polynomial
								int term1 = (polyfirst * x3);

						/* This multiplies the quadratic term times the third expresion. Variable formatting: 'poly x _(power) _(order in the program) */
						
						int polyx2 = (poly * x3);
						int polyx01 = (polylast * x3);
							int polyx11 = (polyfirst * num3);
							int polyx12 = (poly * num3);
							int polyx02	= (polylast * num3);
							//The last 3 terms of the cubic polynomial
								int term2 = (polyx2 + polyx11);
								int term3 = (polyx01 + polyx12);
								int term4 = polyx02;
										//This prints the output of the cubic polynomial
		System.out.println("Polynomial is:" + term1 + "x^3" + "+" + term2 + "x^2" + "+" + term3 + "x" + "+" + term4);
	}
		
}