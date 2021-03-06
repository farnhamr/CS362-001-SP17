/*
 * This file was automatically generated by EvoSuite
 * Tue May 16 03:44:33 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.osu.cs362.Appt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Appt_ESTest extends Appt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(59, 59, 0, 0, 0, "NmiKup;<4q5<?^^I.", "NmiKup;<4q5<?^^I.");
      assertEquals(59, appt0.getStartHour());
      
      appt0.setStartHour(0);
      assertEquals(59, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(8, 8, 8, 8, 8, "InvalidXGCValue-milli", "GeU2t4Ibb");
      boolean boolean0 = appt0.getValid();
      assertEquals(8, appt0.getStartYear());
      assertEquals("GeU2t4Ibb", appt0.getDescription());
      assertEquals(8, appt0.getStartMinute());
      assertEquals(8, appt0.getStartMonth());
      assertEquals(8, appt0.getStartDay());
      assertTrue(boolean0);
      assertEquals("InvalidXGCValue-milli", appt0.getTitle());
      assertEquals(8, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "V<s?}C", (String) null);
      String string0 = appt0.getTitle();
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals("V<s?}C", string0);
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals("", appt0.getDescription());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(762, 762, 762, 762, 762, "I; \"$I_", "Minute");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals(762, int0);
      assertEquals(762, appt0.getStartMinute());
      assertEquals("I; \"$I_", appt0.getTitle());
      assertEquals(762, appt0.getStartDay());
      assertEquals(762, appt0.getStartHour());
      assertEquals(762, appt0.getStartMonth());
      assertEquals("Minute", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-4515), 0, (-27), "XGG=xO*", "XGG=xO*");
      int int0 = appt0.getStartYear();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals("XGG=xO*", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals("XGG=xO*", appt0.getDescription());
      assertEquals((-27), int0);
      assertEquals(-4515, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt((-1298), 12, 12, 0, 12, ", ", "iK4yJ?$fyo\"a\"lT0-^@");
      int int0 = appt0.getStartMonth();
      assertEquals(12, appt0.getStartMinute());
      assertEquals(-1298, appt0.getStartHour());
      assertEquals(12, appt0.getStartDay());
      assertEquals(12, appt0.getStartYear());
      assertEquals(0, int0);
      assertFalse(appt0.getValid());
      assertEquals(", ", appt0.getTitle());
      assertEquals("iK4yJ?$fyo\"a\"lT0-^@", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt(12, 83, 11, (-4002), 756, "t*:,.mc~'l,D(2:[W", "t*:,.mc~'l,D(2:[W");
      int int0 = appt0.getStartMonth();
      assertEquals(756, appt0.getStartYear());
      assertEquals(83, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals((-4002), int0);
      assertEquals(12, appt0.getStartHour());
      assertEquals(11, appt0.getStartDay());
      assertEquals("t*:,.mc~'l,D(2:[W", appt0.getTitle());
      assertEquals("t*:,.mc~'l,D(2:[W", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(84, 3754, 3754, 3754, 84, "org.apache.xerces.jaxp.datatype.DurationImpl", "org.apache.xerces.jaxp.datatype.DurationImpl");
      int int0 = appt0.getStartMinute();
      assertEquals(84, appt0.getStartYear());
      assertEquals(3754, appt0.getStartDay());
      assertEquals("org.apache.xerces.jaxp.datatype.DurationImpl", appt0.getTitle());
      assertEquals(3754, int0);
      assertEquals(84, appt0.getStartHour());
      assertEquals(3754, appt0.getStartMonth());
      assertEquals("org.apache.xerces.jaxp.datatype.DurationImpl", appt0.getDescription());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt((-2327), 0, 31, 2382, (-2327), "CM*|[7lNw0", "CM*|[7lNw0");
      assertEquals(-2327, appt0.getStartHour());
      
      appt0.setStartHour(0);
      int int0 = appt0.getStartHour();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 2150, 1, 1, "12.p1jCDFm6>YRq", "=WRqF2)mv{!51T(mV");
      int int0 = appt0.getStartHour();
      assertEquals("12.p1jCDFm6>YRq", appt0.getTitle());
      assertEquals(1, appt0.getStartYear());
      assertEquals(2150, appt0.getStartDay());
      assertEquals(1, appt0.getStartMinute());
      assertEquals(1, int0);
      assertFalse(appt0.getValid());
      assertEquals("=WRqF2)mv{!51T(mV", appt0.getDescription());
      assertEquals(1, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "V<s?}C", (String) null);
      int int0 = appt0.getStartDay();
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertEquals("", appt0.getDescription());
      assertEquals(0, int0);
      assertEquals(0, appt0.getStartYear());
      assertEquals("V<s?}C", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(728, 728, (-2487), (-1), 68, (String) null, (String) null);
      int int0 = appt0.getStartDay();
      assertEquals(728, appt0.getStartHour());
      assertEquals((-2487), int0);
      assertEquals(728, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(-1, appt0.getStartMonth());
      assertEquals(68, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 23, (String) null, (String) null);
      String string0 = appt0.getDescription();
      assertEquals(23, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertNotNull(string0);
      assertEquals(0, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt((-2327), 0, 31, 2382, (-2327), "CM*|[7lNw0", "CM*|[7lNw0");
      appt0.setDescription("CM*|[7lNw0");
      assertEquals("CM*|[7lNw0", appt0.getTitle());
      assertEquals(-2327, appt0.getStartHour());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-2327, appt0.getStartYear());
      assertEquals("CM*|[7lNw0", appt0.getDescription());
      assertEquals(31, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(2382, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt((-1121), (-1121), 11, (-3532), 2188, "", "");
      appt0.setDescription((String) null);
      assertEquals(-1121, appt0.getStartHour());
      assertEquals(2188, appt0.getStartYear());
      assertEquals(11, appt0.getStartDay());
      assertEquals(-1121, appt0.getStartMinute());
      assertEquals(-3532, appt0.getStartMonth());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-2327), 0, 31, 2382, (-2327), "CM*|[7lNw0", "CM*|[7lNw0");
      appt0.setTitle(".|&");
      assertEquals(".|&", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt((-503), (-503), 23, (-503), (-503), (String) null, (String) null);
      String string0 = appt0.getTitle();
      assertEquals(-503, appt0.getStartMinute());
      assertEquals(-503, appt0.getStartYear());
      assertEquals(-503, appt0.getStartHour());
      assertEquals(23, appt0.getStartDay());
      assertEquals(-503, appt0.getStartMonth());
      assertNotNull(string0);
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt((-2327), 0, 31, 2382, (-2327), "CM*|[7lNw0", "CM*|[7lNw0");
      int int0 = appt0.getStartDay();
      assertEquals("CM*|[7lNw0", appt0.getTitle());
      assertEquals(31, int0);
      assertEquals(2382, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(-2327, appt0.getStartYear());
      assertEquals("CM*|[7lNw0", appt0.getDescription());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(-2327, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt((-2042), (-2042), 0, 0, (-2042), "", "");
      boolean boolean0 = appt0.getValid();
      assertFalse(boolean0);
      assertEquals(-2042, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-2042, appt0.getStartHour());
      assertEquals(-2042, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt((-2062), (-2062), 1, 1, (-221), "", "/");
      int int0 = appt0.getStartHour();
      assertEquals(-221, appt0.getStartYear());
      assertEquals(-2062, appt0.getStartMinute());
      assertEquals(1, appt0.getStartMonth());
      assertEquals("", appt0.getTitle());
      assertEquals((-2062), int0);
      assertFalse(appt0.getValid());
      assertEquals("/", appt0.getDescription());
      assertEquals(1, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(0, 23, 23, 23, 0, "---%D%z", "");
      int int0 = appt0.getStartYear();
      assertEquals(0, int0);
      assertEquals("", appt0.getDescription());
      assertEquals(23, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertEquals(23, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals("---%D%z", appt0.getTitle());
      assertEquals(23, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt((-6895), (-6895), (-6895), 0, 0, "1j*W", "p}X$");
      int int0 = appt0.getStartMinute();
      assertEquals("p}X$", appt0.getDescription());
      assertEquals("1j*W", appt0.getTitle());
      assertEquals(-6895, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-6895, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals((-6895), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, ":", ":");
      String string0 = appt0.getDescription();
      assertEquals(":", string0);
      assertEquals(11, appt0.getStartMonth());
      assertEquals(11, appt0.getStartHour());
      assertTrue(appt0.getValid());
      assertEquals(11, appt0.getStartYear());
      assertEquals(11, appt0.getStartDay());
      assertEquals(11, appt0.getStartMinute());
      assertEquals(":", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 12, 12, 12, "s)", "s)");
      appt0.setStartHour(0);
      appt0.toString();
      assertEquals(0, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 12, 12, 12, "s)", "s)");
      String string0 = appt0.toString();
      assertEquals("\t12/12/12 at 11:23pm ,s), s)\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 8, 0, 11, (String) null, (String) null);
      int int0 = appt0.getStartMinute();
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
      assertEquals(11, appt0.getStartYear());
      assertEquals(0, int0);
      assertEquals(8, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 2150, 1, 1, "12.p1jCDFm6>YRq", "=WRqF2)mv{!51T(mV");
      int int0 = appt0.getStartMonth();
      assertEquals(1, int0);
      assertEquals(1, appt0.getStartMinute());
      assertEquals("=WRqF2)mv{!51T(mV", appt0.getDescription());
      assertEquals("12.p1jCDFm6>YRq", appt0.getTitle());
      assertEquals(1, appt0.getStartHour());
      assertEquals(2150, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 23, (String) null, (String) null);
      appt0.setTitle((String) null);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartDay());
      assertEquals(23, appt0.getStartYear());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1160, 1, (String) null, (String) null);
      assertEquals(1, appt0.getStartMinute());
      
      appt0.setStartMinute(1160);
      assertEquals(1160, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 1, 1160, 1, (String) null, (String) null);
      appt0.setStartMinute((-4374));
      assertEquals(-4374, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(8, 8, 8, 8, 8, "InvalidXGCValue-milli", "GeU2t4Ibb");
      appt0.setStartYear(0);
      assertEquals(0, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(8, 8, 8, 8, 8, "InvalidXGCValue-milli", "GeU2t4Ibb");
      appt0.setStartDay(8);
      assertEquals(8, appt0.getStartMinute());
      assertEquals(8, appt0.getStartMonth());
      assertEquals("InvalidXGCValue-milli", appt0.getTitle());
      assertEquals(8, appt0.getStartDay());
      assertTrue(appt0.getValid());
      assertEquals(8, appt0.getStartYear());
      assertEquals(8, appt0.getStartHour());
      assertEquals("GeU2t4Ibb", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(8, 8, 8, 8, 8, "InvalidXGCValue-milli", "GeU2t4Ibb");
      appt0.setStartHour((-536));
      appt0.toString();
      assertEquals(-536, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Appt appt0 = new Appt(8, 8, 8, 8, 8, "InvalidXGCValue-milli", "GeU2t4Ibb");
      appt0.setStartMonth(8);
      assertEquals(8, appt0.getStartHour());
      assertEquals("GeU2t4Ibb", appt0.getDescription());
      assertEquals(8, appt0.getStartMinute());
      assertEquals("InvalidXGCValue-milli", appt0.getTitle());
      assertEquals(8, appt0.getStartDay());
      assertTrue(appt0.getValid());
      assertEquals(8, appt0.getStartMonth());
      assertEquals(8, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, ":", ":");
      String string0 = appt0.toString();
      assertEquals("\t11/11/11 at 11:11am ,:, :\n", string0);
      assertNotNull(string0);
  }
}
