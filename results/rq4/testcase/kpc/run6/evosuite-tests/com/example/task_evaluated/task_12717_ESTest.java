/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:42:28 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12717;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.Period;
import java.time.Year;
import java.time.temporal.TemporalAmount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockYear;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12717_ESTest extends task_12717_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12717 task_12717_0 = new task_12717();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Year year0 = MockYear.now();
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(year0, (TemporalAmount) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.Year", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Period period0 = Period.ofYears(1);
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(instant0, period0);
      } catch(DateTimeException e) {
         //
         // Error adding period to temporal object
         //
         verifyException("com.example.task_evaluated.task_12717", e);
      }
  }
}
