/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:56:05 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12717;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.OffsetTime;
import java.time.Period;
import java.time.temporal.Temporal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockOffsetTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12717_ESTest extends task_12717_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Duration duration0 = Duration.ofDays(1L);
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_12717 task_12717_0 = new task_12717();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OffsetTime offsetTime0 = MockOffsetTime.now();
      Period period0 = Period.of(996, 996, 996);
      // Undeclared exception!
      try { 
        task_12717.addToTemporal(offsetTime0, period0);
      } catch(DateTimeException e) {
         //
         // Error adding period to temporal object
         //
         verifyException("com.example.task_evaluated.task_12717", e);
      }
  }
}
