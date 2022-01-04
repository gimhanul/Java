package enumeration;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance(); //Calendar 객체 얻기
        int week = cal.get(Calendar.DAY_OF_WEEK); //일요일(1)~토요일(7) 숫자를 return

        switch (week) {
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY; break;
        }

        System.out.println("오늘은 "+today);
    }
}
