package assignments.methods;

public class Loan {
	
    String name;
    double amount, rate;
    int years;

    public Loan(String n, double a, double r, int y){
        name = n;
        amount = a;
        rate = r;
        years = y;
    }
    
    public void assume(Loan source){
        double temp = source.amount;
        amount = amount + temp;
        source.amount = 0.0;
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(name);
        sb.append(", ");
        sb.append(amount);
        sb.append(", ");
        sb.append(rate);
        sb.append(", ");
        sb.append(years);
        return sb.toString();
    }
    
    public void setName(String n) {
        name = n;
    }
    public void setAmount(double a) {
        amount = a;
    }
    public void setRate(double r) {
        rate = r;
    }
    public void setYears(int y) {
        years = y;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public double getRate() {
        return rate;
    }
    public int getYears() {
        return years;
    }
    
    public double computeMonthlyPayment() {
    	double monthlyInterestDecimal = this.rate / (12 * 100);
    	double expEq = Math.pow(1 + monthlyInterestDecimal, this.years*-12); 
    	double monthlyPayment = this.amount * ( monthlyInterestDecimal / ( 1 - expEq ));
    	return monthlyPayment;
    }
    
}