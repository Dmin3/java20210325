package p05.textbook.s050703;

import p05.textbook.s050701.Week;

public class EnumMethodExample {
	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name(); // String으로 변환해서 리턴
		System.out.println(name);
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNEDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		
			String strDay = "SUNDAY";
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATUDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말이군요");
			} else {
				System.out.println("평일 이군요");
			}
		
			
		// values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		}
	}



