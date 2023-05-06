/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:47:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12717;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.MinguoDate;
import java.time.temporal.TemporalAmount;
import java.time.temporal.UnsupportedTemporalTypeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockLocalDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12717_ESTest extends task_12717_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Instant instant0 = MockInstant.ofEpochSecond(1607L);
      Period period0 = Period.of(1, 1, (-1328));
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(instant0, period0);
      } catch(UnsupportedTemporalTypeException e) {
         //
         // Unsupported unit: Months
         //
         verifyException("java.time.Instant", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_12717 task_12717_0 = new task_12717();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LocalDate localDate0 = MockLocalDate.now();
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(localDate0, (TemporalAmount) null);
      } catch(NullPointerException e) {
         //
         // amountToAdd
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MinguoDate minguoDate0 = MockMinguoDate.now();
      Period period0 = Period.ofMonths(883);
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(minguoDate0, period0);
      } catch(DateTimeException e) {
         //
         // Chronology mismatch, expected: ISO, actual: Minguo
         //
         verifyException("java.time.Period", e);
      }
  }
}