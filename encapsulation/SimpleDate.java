package assignments.encapsulation;

import java.util.Date;

public class SimpleDate {
	
	//data
	private int month;
	private int day;
	private int year;
	private static int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private static String names[] =
		    {"January", "February", "March", "April", "May",
		     "June", "July", "August", "September", "October",
		     "November", "December"};
	
	//construct
	public SimpleDate() {
		dateHelper();
	}
	public SimpleDate(int day) {
		dateHelper();
		this.day = day;
	}
	public SimpleDate(int month, int day) {
		dateHelper();
		this.month = month;
		this.day = day;
	}
	public SimpleDate(int month, int day, int year) {
		this.month = month;
		this.day = day;	
		this.year = year;
	}
	
	// methods
	private void dateHelper() {
		Date now = new Date();
		this.day = now.getDate();
		this.month = now.getMonth() + 1;
		this.year = now.getYear() + 1900;
	}
	
	public boolean isLeapYear() {
	    return this.year % 400 == 0 ||
	           ((this.year % 4 == 0) && (this.year % 100 != 0));
	}
	
	public String getMonthAsString() {
		return names[month-1];
	}
	public int getDayOfYear() {
        int sum = 0;
        for (int i = 0; i < month - 1; i++)
            sum += months[i];
        return sum + day;
	}
	public int getDaysLeftInYear() {
        int days = 365;
        if (isLeapYear())
            days = 366;
        return days - getDayOfYear();
	}
	
	public int getDay() {
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void setDay(int d) {
		this.day = d;
	}
	public void setMonth(int m) {
		this.month = m;
	}
	public void setYear(int y) {
		this.year = y;
	}
	
	public String toString() {
		return this.month + "/" + this.day + "/" + this.year; 
	}
	
}