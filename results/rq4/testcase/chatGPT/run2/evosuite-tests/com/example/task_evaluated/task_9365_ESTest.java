/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:12:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9365;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9365_ESTest extends task_9365_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9365.getCurrentJapaneseDate((Clock) null);
      } catch(NullPointerException e) {
         //
         // clock
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9365 task_9365_0 = new task_9365();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZoneId zoneId0 = ZoneId.systemDefault();
      Clock clock0 = MockClock.tickMinutes(zoneId0);
      ChronoUnit chronoUnit0 = ChronoUnit.ERAS;
      Duration duration0 = chronoUnit0.getDuration();
      Clock clock1 = MockClock.offset(clock0, duration0);
      // Undeclared exception!
      try { 
        task_9365.getCurrentJapaneseDate(clock1);
      } catch(DateTimeException e) {
         //
         // Instant exceeds minimum or maximum instant
         //
         verifyException("java.time.Instant", e);
      }
  }
}
