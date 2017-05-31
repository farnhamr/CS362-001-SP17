package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"setTitle","setDescription","setStartHour","setStartMinute","setStartDay","setStartMonth","setStartYear"};// The list of the of methods to be tested in the Appt class

		int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

		return methodArray[n] ; // return the method name
	}

    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 long startTime = Calendar.getInstance().getTimeInMillis();
		 long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		 //get todays date
		 Calendar rightnow = Calendar.getInstance();
		 //current month/year/date is today
		 int thisMonth = rightnow.get(Calendar.MONTH)+1;
		 int thisYear = rightnow.get(Calendar.YEAR);
		 int thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		 System.out.println("Start testing...");

		 for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			 long randomseed = 10;//System.currentTimeMillis();
			 //			System.out.println(" Seed:"+randomseed );
			 Random random = new Random(randomseed);

			 TimeTable ttable = new TimeTable();
			 GregorianCalendar firstday = new GregorianCalendar(0, 1, 1);
			 GregorianCalendar lastday = new GregorianCalendar(100000, 12, 31);

			 GregorianCalendar gcal = new GregorianCalendar(thisYear,thisMonth,thisDay);
			 CalDay cal = new CalDay(gcal);

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

			 for (int i = 0; i < NUM_TESTS; i++) {
				 String methodName = ApptRandomTest.RandomSelectMethod(random);
				 if (methodName.equals("setTitle")){
					 String newTitle= ValuesGenerator.getString(random);
					 appt.setTitle(newTitle);
				 }

				 if (methodName.equals("setDescription")){
					 String newDescription= ValuesGenerator.getString(random);
					 appt.setDescription(newDescription);
				 }

				 if (methodName.equals("setStartHour")){
					 int newHour= ValuesGenerator.getRandomIntBetween(random,0,24);
					 appt.setStartHour(newHour);
				 }

				 if (methodName.equals("setStartMinute")){
					 int newMinute= ValuesGenerator.getRandomIntBetween(random,0,60);
					 appt.setStartMinute(newMinute);
				 }

				 if (methodName.equals("setStartDay")){
					 int newDay= ValuesGenerator.getRandomIntBetween(random,1,32);
					 appt.setStartDay(newDay);
				 }

				 if (methodName.equals("setStartMonth")){
					 int newMonth= ValuesGenerator.getRandomIntBetween(random,1,13);
					 appt.setStartMonth(newMonth);
				 }

				 if (methodName.equals("setStartYear")){
					 int newYear= ValuesGenerator.getRandomIntBetween(random,0,10000);
					 appt.setStartYear(newYear);
				 }

				 cal.addAppt(appt);
				 cal.toString();

				 //ttable.getApptRange(cal.getAppts(), firstday, lastday);
				 ttable.deleteAppt(cal.getAppts(), appt);
			 }

			 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			 if((iteration%10000)==0 && iteration!=0 )
				 System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

		 }
	 }


	
}
