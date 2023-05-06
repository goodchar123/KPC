/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 02:53:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6644;
import java.time.Clock;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.temporal.UnsupportedTemporalTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
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
      LocalDate localDate0 = MockLocalDate.ofYearDay((-1449), 1);
      MonthDay monthDay0 = MockMonthDay.from(localDate0);
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, "vCW Vee");
      } catch(IllegalArgumentException e) {
         //
         // Unknown pattern letter: v
         //
         verifyException("java.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      MonthDay monthDay0 = MockMonthDay.now(clock0);
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, (String) null);
      } catch(NullPointerException e) {
         //
         // pattern
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MonthDay monthDay0 = MockMonthDay.now();
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, "Fe-");
      } catch(UnsupportedTemporalTypeException e) {
         //
         // Unsupported field: AlignedDayOfWeekInMonth
         //
         verifyException("java.time.MonthDay", e);
      }
  }
}