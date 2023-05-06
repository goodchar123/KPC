/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:35:32 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12717;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Period;
import java.time.chrono.ThaiBuddhistDate;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12717_ESTest extends task_12717_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ThaiBuddhistDate thaiBuddhistDate0 = MockThaiBuddhistDate.now();
      Period period0 = Period.ofWeeks(394);
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(thaiBuddhistDate0, period0);
      } catch(DateTimeException e) {
         //
         // Error adding period to temporal object
         //
         verifyException("com.example.task_evaluated.task_12717", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_12717 task_12717_0 = new task_12717();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChronoField chronoField0 = ChronoField.HOUR_OF_DAY;
      TemporalUnit temporalUnit0 = chronoField0.getBaseUnit();
      Duration duration0 = Duration.of(0L, temporalUnit0);
      // Undeclared exception!
      try { 
        task_12717.addToTemporal((Temporal) null, duration0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_12717", e);
      }
  }
}