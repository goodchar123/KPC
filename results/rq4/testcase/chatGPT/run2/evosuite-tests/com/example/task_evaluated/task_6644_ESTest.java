/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 18:55:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6644;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.UnsupportedTemporalTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
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
        task_6644.formatMonthDay(monthDay0, "'P;kfY");
      } catch(IllegalArgumentException e) {
         //
         // Pattern ends with an incomplete string literal: 'P;kfY
         //
         verifyException("java.time.format.DateTimeFormatterBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MonthDay monthDay0 = MockMonthDay.now();
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
      ZoneOffset zoneOffset0 = ZoneOffset.UTC;
      MonthDay monthDay0 = MockMonthDay.now((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, "z\"N,F7X8F");
      } catch(DateTimeException e) {
         //
         // Unable to extract value: class java.time.MonthDay
         //
         verifyException("java.time.format.DateTimePrintContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.ofHoursMinutesSeconds(0, 0, 0);
      Clock clock0 = MockClock.tickSeconds(zoneOffset0);
      MonthDay monthDay0 = MockMonthDay.now(clock0);
      // Undeclared exception!
      try { 
        task_6644.formatMonthDay(monthDay0, "G/s4");
      } catch(UnsupportedTemporalTypeException e) {
         //
         // Unsupported field: Era
         //
         verifyException("java.time.MonthDay", e);
      }
  }
}