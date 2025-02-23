package Bai3_5;

import java.util.Calendar;

public class MyDate {
	private int year, month, day;
	public String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	public String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	public int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
		return false;
	}
	public boolean isValidDate(int year, int month, int day) {
		if ((year >= 1 && year <= 9999) || (month >= 1 && month <= 12) || checkDay(year, month, day)) {
			return true;
		}
		return false;
	}
	public boolean checkDay(int yaer, int month, int day) {
		boolean check = false;
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			day = 31;
			check = true;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
			check = true;
		}
		else if (isLeapYear(year)) {
			day = 29;
			check = true;
		}
		else {
			day = 28;
			check = true;
		}
		return check;
	}
	public int getDayOfWeek(int year, int month, int day) {
		int monthCode = -1000000000;
		if (month == 1 || month == 10) {
			monthCode = 6;
		}
		else if (month == 3 || month == 11) {
			monthCode = 2;
		}
		else if (month == 4 || month == 7) monthCode = 5;
		else if (month == 5) monthCode = 0;
		else if (month == 6) monthCode = 3;
		else if (month == 8) monthCode = 1;
		else if (month == 9 || month == 12) monthCode = 4;
		else if (month == 2) {
			if (isLeapYear(year)) monthCode = 1;
			else monthCode = 2;
		}

		int yearCode = ((int)((double)(year % 100) * 1.25) % 7);
		if (year >= 100 && year <= 199) yearCode += 5;
		else if (year <= 299) yearCode += 3;
		else if (year <= 399) yearCode += 1;
		else yearCode += 0;
		int dayOfWeek = (day + monthCode + yearCode) % 7;
		
		return dayOfWeek;
	}
	
	public void setDate(int year,int month,int day){
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month=month;
        this.day =day;
    }
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return DAYS[getDayOfWeek(year, month, day)] + " " + day + " "  + MONTHS[month - 1] + " " + year;
	}
	
	private void normalizeDate(){
        if(!isLeapYear(this.year)){
            for (int i = 0; i<12;i++){
                if (this.month == i+1){
                    if (day > DAYS_IN_MONTHS[i]){
                        day =1;
                        month++;
                    }else if(day == 0){
                        if(i >0) {day = DAYS_IN_MONTHS[i-1];}
                        else {day = DAYS_IN_MONTHS[11]; month =12;year--;}


                    }
                }
            }
            if (month > 12){
                month %=12;
                year++;
            }else if(month == 0){
                month =12;
                year--;
            }
        }else{
        	DAYS_IN_MONTHS[1] = 29;
            for (int i = 0; i<12;i++){
                if (this.month == i+1){
                    if (day > DAYS_IN_MONTHS[i]){
                        day =1;
                        month++;
                    }else if(day == 0){
                        if(i >0) {day = DAYS_IN_MONTHS[i-1];}
                        else {day = DAYS_IN_MONTHS[11]; month =12;year--;}


                    }
                }
            }
            if (month > 12){
                month %=12;
                year++;
            }
        }


    }
	public MyDate nextDay(){
        day++;
        normalizeDate();
        return this;
    }
    public MyDate nextMonth(){
        month++;
        normalizeDate();
        return this;
    }
    public MyDate nextYear(){
        year++;
        return this;
    }
    public MyDate previousDay(){
        day--;
        normalizeDate();
        return this;
    }
    public MyDate previousMonth(){
        for (int i = 0; i<12;i++){
            if (this.month == i+1){
                if (day > DAYS_IN_MONTHS[i-1]){
                    day = DAYS_IN_MONTHS[i-1];
                }
            }
        }
        month--;

        return  this;
    }
    public MyDate previousYear(){
        if (isLeapYear(year) && this.month ==2){
            if(day== 29){
                day = 28;
            }
        }
        year--;

        return this;
    }
}
