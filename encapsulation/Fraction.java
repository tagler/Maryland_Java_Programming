package assignments.encapsulation;

public class Fraction {
	
	// data
    private int numer;
    private int denom;

    // construct 
    public Fraction(int numer, int denom){
        // use of "this" is required here
        this.numer = numer;
        this.denom = denom;
        if (denom == 0) {
        	System.out.println("you can not create a fraction with a denominator of 0, using 1");
        	this.denom = 1;
        }
    }
    public Fraction(){
        this(0,1);
    }
    
    // methods 
    public String toString() {
        int val = this.gcd(numer, denom);
        return numer/val + "/" + denom/val;
    }
    private int gcd(int top, int bot) {
        int quot;
        int rem;
        quot = top / bot;
        rem = top % bot;
        while(rem != 0) {
            top = bot;
            bot = rem;
            quot = top / bot;
            rem = top % bot;
        }
        return bot;
    }
    public Fraction add(Fraction f){
        Fraction temp = new Fraction();
        temp.numer = (this.numer * f.denom) + (this.denom * f.numer);
        temp.denom = (this.denom * f.denom);
        return temp;
    }
    public Fraction subtract(Fraction f){
        Fraction temp = new Fraction();
        temp.numer = (this.numer * f.denom) - (this.denom * f.numer);
        temp.denom = this.denom * f.denom;
        return temp;
    }
    public Fraction multiply(Fraction p) {
        Fraction temp = new Fraction();
        temp.numer = this.numer * p.numer;
        temp.denom = this.denom * p.denom;
        return temp;
    }
    public Fraction divide(Fraction f){
        Fraction temp = new Fraction();
        temp.numer = this.numer * f.denom;
        temp.denom = this.denom * f.numer;
        return temp;
    }

}