//Name: Sydney Varner
//PantherID:002-527-007
//Due Date: July 7
//=======================================

public class Fraction {
	// Instance variables	
	private int numerator; // Numerator of fraction
	private int denominator; // Denominator of fraction
	
	// Constructors
	
	//This constructor sets the values of the numerator and denominator
	public Fraction(int num, int denom) {
		numerator = num;	
		denominator = denom;
	}
	
	//This construction sets the numerator of the fraction to 0 and the denominator to 1
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	//This construction sets the numberator to a given parameter and sets the denominator to 1
	public Fraction(int num) {
		numerator = num;
		denominator = 1;
	}
	// Instance methods
	
	//This method return the numerator
	public int getNumerator() {
		return numerator;
	}
	
	//This method returns the denominator
	public int getDenominator() {
		return denominator;
	}
	
	//This method adds the original fraction and a fraction given by the parameter
	public Fraction add(Fraction f) {
		int num = numerator * f.denominator + f.numerator * denominator;
		int denom = denominator * f.denominator;
		return new Fraction(num, denom);
	}
	
	//This method divides the original fraction by a fraction given by the parameter
	public Fraction divide(Fraction f) {
		int num = numerator * f.denominator;
		int denom = denominator * f.numerator;
		return new Fraction(num, denom);
	}
	
	//This scales the fraction up by a given factor
	public Fraction scaleup(int factor) {
		int num = numerator *= factor;
		int denom = denominator;
		return new Fraction(num , denom);
	}
	
	//This method scales the fraction down by a given factor
	public Fraction scaledown(int factor) {
		int num = numerator;
		int denom = denominator;
		if(factor != 0) {
			denom = denominator *= factor;
		} else {
			System.out.println("Scaling requires a factor other than 0");
		}
		return new Fraction(num, denom);
	}
	
	//The scale method determines how a fraction will be scales. If the boolean is true, the fraction is scaled up. If not, the fraction is scaled down.
	public void scale(int factor, boolean flag) {
		if (factor != 0) {
			if (flag == true) {
				scaleup(factor);
			}
			else {
				scaledown(factor);
			}
		} else {
			//Returns a message is the scaling factor is 0
			System.out.println("Scaling requires a factor other than 0");
		}
	}
	
	public String toString() {
		return "\nScaled fraction is: " + numerator + "/" + denominator;
	}
}