package p05.textbook.s050701;

import java.util.Calendar;

public class EnumWeekExample {
	public static void main(String[] args) {
		Week today = null; // today라는 변수를 초기화
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		
		switch(week) {
		case 1 :
			today = Week.SUNDAY;
			break;
		case 2 :
			today = Week.MONDAY;
			break;
		case 3 :
			today = Week.TUEDAY;
			break;
		case 4 :
			today = Week.WEDNEDAY;
			break;
		case 5 :
			today = Week.THURDAY;
			break;
		case 6 :
			today = Week.FRIDAY;
			break;
		case 7 :
			today = Week.SATUDAY;
			break;
		}
		System.out.println("오늘 요일 : " + today);
		
		if (today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다");
			
		} else {
			System.out.println("열심히 자바를 공부합니다");
		}
	}
}
