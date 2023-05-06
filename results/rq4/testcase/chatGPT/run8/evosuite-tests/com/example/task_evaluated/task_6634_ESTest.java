/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:35:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6634;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.UnsupportedTemporalTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockMonthDay;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6634_ESTest extends task_6634_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6634 task_6634_0 = new task_6634();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MonthDay monthDay0 = MockMonthDay.now();
      ChronoField chronoField0 = ChronoField.DAY_OF_YEAR;
      // Undeclared exception!
      try { 
        task_6634.getFieldValue(monthDay0, chronoField0);
      } catch(UnsupportedTemporalTypeException e) {
         //
         // Unsupported field: DayOfYear
         //
         verifyException("java.time.MonthDay", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.YEAR_OF_ERA;
      // Undeclared exception!
      try { 
        task_6634.getFieldValue((MonthDay) null, chronoField0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6634", e);
      }
  }
}