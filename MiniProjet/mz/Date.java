package mz;

import java.time.Year;
import java.time.YearMonth;
import java.time.MonthDay;

public class Date {
	
	
	private int year;
	private int month;
	private int date;

	public Date(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	public Date(){
		year = Year.now().getValue();	
		month = YearMonth.now().getMonthValue();
		date = MonthDay.now().getDayOfMonth();
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
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	
	public String toString() {
		return year+"-"+(month<10?"0"+month:month)+"-"+(date>=10?date:"0"+date);
	}

	public boolean equals(Date d) {
		return (date == d.date) && (month == d.month) && (year==d.year);
	}
	
	public Date next(int n){
		int j = getDate()+n;
		int m = getMonth();
		int a = getYear();
		while(j>Date.nbJour(a, m)){
			j-=Date.nbJour(a, m);
			m++;
			if(m>12){
				m=1;
				a++;
			}				
		}
		return new Date(a, m, j); 
	}
	
	public static int nbJour(int an, int mois){
		boolean bis = (an%400==0)||(an%100!=0 && an%4==0);
		switch (mois) {
		case 2:
			return (bis?29:28);
		case 4:
			
		case 6:
			
		case 9:
			
		case 11:
			return 30;
		default:
			return 31;
		}
	}

	public static Date valueOf(String str){
		int p = str.indexOf('-');
		int p2 = str.indexOf('-', p+1);
		int a = Integer.valueOf(str.substring(0, p));
		int m = Integer.valueOf(str.substring(p+1, p2));
		int j = Integer.valueOf(str.substring(p2+1, str.length()));
		if(m<1 || m>12 || j<1 || j>Date.nbJour(a, m))
			return null;
		return new Date(a,m,j);
	}
}
