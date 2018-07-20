package assignments.ooprogramming;

import java.util.Date;

public class SimpleDate {
	
	//data
	int month;
	int day;
	int year;
	
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