package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
		 //Construct a new Appointment object with the initial data
		 CalDay cal = new CalDay();

		 // assertions
		 assertEquals(false, cal.valid);

		 assertEquals(null, cal.iterator());

		 CalDay CAL = new CalDay(null);
	 }

	@Test
	public void test02()  throws Throwable  {
		//get today's date

		Calendar rightnow = Calendar.getInstance();
		//current month/year/date is today
		int thisMonth = 5;
		int thisYear = 2017;
		int thisDay = 1;

		GregorianCalendar today = new GregorianCalendar(thisYear,thisMonth,thisDay);

		//Construct a new Appointment object with the initial data
		CalDay cal = new CalDay(today);

		// assertions
		assertEquals(true, cal.isValid());
		assertEquals(thisMonth, cal.getMonth());
		assertEquals(thisYear, cal.getYear());
		assertEquals(thisDay, cal.getDay());

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
		assertEquals(1, cal.getSizeAppts());

		cal.iterator();

		/*
		assertEquals("\t --- 5/1/2017 --- \n" +
				" --- -------- Appointments ------------ --- \n" +
				"\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party. \n", cal.toString());
		*/
		assertNotEquals("", cal.toString());


		cal.addAppt(appt);
		assertEquals(2, cal.getSizeAppts());
	}

}
