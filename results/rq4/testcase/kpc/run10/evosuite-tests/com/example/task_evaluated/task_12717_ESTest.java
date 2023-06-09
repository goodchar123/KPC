/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:47:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12717;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.time.chrono.MinguoDate;
import java.time.temporal.TemporalAmount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12717_ESTest extends task_12717_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12717 task_12717_0 = new task_12717();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Clock clock0 = MockClock.systemDefaultZone();
      Instant instant0 = MockInstant.now(clock0);
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(instant0, (TemporalAmount) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.time.Instant", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MinguoDate minguoDate0 = MockMinguoDate.now();
      Duration duration0 = Duration.ofHours((-2521L));
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(minguoDate0, duration0);
      } catch(DateTimeException e) {
         //
         // Error adding period to temporal object
         //
         verifyException("com.example.task_evaluated.task_12717", e);
      }
  }
}
