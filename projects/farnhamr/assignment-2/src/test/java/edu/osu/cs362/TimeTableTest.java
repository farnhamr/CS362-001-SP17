package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 TimeTable table = new TimeTable();
		 //get today's date

		 Calendar rightnow = Calendar.getInstance();
		 //current month/year/date is today
		 int thisMonth = 5;
		 int thisYear = 2017;
		 int thisDay = 1;

		 GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		 //Construct a new Appointment object with the initial data
		 CalDay cal = new CalDay(today);

		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
				 startMinute ,
				 startDay ,
				 startMonth ,
				 startYear ,
				 title,
				 description);

		 cal.addAppt(appt);

		 GregorianCalendar firstDay = new GregorianCalendar(2016,5,1);
		 GregorianCalendar lastDay = new GregorianCalendar(2017,5,1);

		 table.getApptRange(cal.getAppts(), firstDay, lastDay);

		 int listlength = cal.getSizeAppts();
		 table.deleteAppt(cal.getAppts(), appt);
		 assertNotEquals(listlength, cal.getSizeAppts());

		 assertEquals(null, table.deleteAppt(cal.getAppts(), null));
		 appt.setStartMonth(1000);
		 assertEquals(null, table.deleteAppt(cal.getAppts(), appt));

	 }

	@Test
	public void test02()  throws Throwable  {
		TimeTable table = new TimeTable();
		//get today's date

		Calendar rightnow = Calendar.getInstance();
		//current month/year/date is today
		int thisMonth = 5;
		int thisYear = 2017;
		int thisDay = 1;

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		//Construct a new Appointment object with the initial data
		CalDay cal = new CalDay(today);

		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt appt = new Appt(startHour,
				startMinute ,
				startDay ,
				startMonth ,
				startYear ,
				title,
				description);

		int hr=13;
		int mn=30;
		int dy=10;
		int mth=4;
		int yr=2222;
		String t="Birthday Party";
		String des="This is my birthday party.";
		//Construct a new Appointment object with the initial data
		Appt Futureappt = new Appt(hr,
				mn ,
				dy ,
				mth ,
				yr ,
				t ,
				des);

		yr=1000;
		Appt Pastappt = new Appt(hr,
				mn ,
				dy ,
				mth ,
				yr ,
				t ,
				des);

		cal.addAppt(appt);
		cal.addAppt(Futureappt);
		cal.addAppt(Pastappt);

		GregorianCalendar firstDay = new GregorianCalendar(2016,5,1);
		GregorianCalendar lastDay = new GregorianCalendar(2017,5,1);

		//incorrect should throw error
		table.getApptRange(cal.getAppts(), firstDay, lastDay);
		table.getApptRange(cal.getAppts(), lastDay, firstDay);

	}

}
