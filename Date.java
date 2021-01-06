
public class Date {
	private int year;
	private int month;
	private int day;
	
	boolean ismonthvalid() {
		return month >= 1 && month <=12;
	}
	
	boolean isdayvalid() {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return day >= 1 && day <=31;
		}else if (month == 4 || month == 6 || month == 9 || month == 11){
			return day >= 1 && day <= 30;
		}else if (month == 2){
			if (isleapyear()) {
				return day >= 1 && day <= 29;
			}else {
				return day >= 1 && day <= 28;
			}
		}
		return false;
	}
	
	boolean isleapyear() {
		boolean divisibleby4 = year % 4 == 0;
		boolean divisibleby100 = year % 100 == 0;
		boolean divisibleby400 = year % 400 == 0;
		return divisibleby4 && (!divisibleby100 || divisibleby400);
	}
}
