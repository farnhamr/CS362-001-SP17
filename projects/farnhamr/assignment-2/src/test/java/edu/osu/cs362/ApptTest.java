package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

	@Test
	public void test02()  throws Throwable  {
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
		appt.setStartHour(100);
		appt.setStartMinute(300);
		appt.setStartDay(50);
		appt.setStartMonth(55);
		appt.setStartYear(2222);
		appt.setDescription(null);
		appt.setTitle(null);

		//assertions
		assertEquals(100, appt.getStartHour());
		assertEquals(300, appt.getStartMinute());
		assertEquals(50, appt.getStartDay());
		assertEquals(55, appt.getStartMonth());
		assertEquals(2222, appt.getStartYear());
		assertEquals("", appt.getDescription());
		assertEquals("", appt.getTitle());
		assertEquals(false, appt.getValid());
	}

	@Test
	public void test03()  throws Throwable  {
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
		// assertions
		assertEquals("\t4/10/2017 at 1:30pm ,Birthday Party, This is my birthday party.\n",appt.toString());

		appt.setStartHour(300);
		assertEquals(null, appt.toString());

		appt.setStartHour(0);
		assertEquals("\t4/10/2017 at 12:30am ,Birthday Party, This is my birthday party.\n", appt.toString());
	}

	//end
}
