/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:37:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6644;
import java.time.DateTimeException;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.temporal.UnsupportedTemporalTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6644_ESTest extends task_6644_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6644 task_6644_0 = new task_6644();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MonthDay monthDay0 = MockMonthDay.now();
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, "SIlX@rej 5Xw?<r}");
      } catch(IllegalArgumentException e) {
         //
         // Unknown pattern letter: I
         //
         verifyException("java.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay((MonthDay) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6644", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      MonthDay monthDay0 = MockMonthDay.now(zoneId0);
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, "z _");
      } catch(DateTimeException e) {
         //
         // Unable to extract value: class java.time.MonthDay
         //
         verifyException("java.time.format.DateTimePrintContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MonthDay monthDay0 = MockMonthDay.now();
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, "?E_");
      } catch(UnsupportedTemporalTypeException e) {
         //
         // Unsupported field: DayOfWeek
         //
         verifyException("java.time.MonthDay", e);
      }
  }
}
