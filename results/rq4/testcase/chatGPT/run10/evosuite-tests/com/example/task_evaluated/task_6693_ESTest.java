/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:51:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6693;
import java.time.Clock;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockClock;
import org.evosuite.runtime.mock.java.time.MockOffsetDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6693_ESTest extends task_6693_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6693 task_6693_0 = new task_6693();
      // Undeclared exception!
      try { 
        task_6693_0.changeNanoOfSecond((OffsetDateTime) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6693", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6693 task_6693_0 = new task_6693();
      Clock clock0 = MockClock.systemUTC();
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now(clock0);
      // Undeclared exception!
      try { 
        task_6693_0.changeNanoOfSecond(offsetDateTime0, (-1));
      } catch(DateTimeException e) {
         //
         // Invalid value for NanoOfSecond (valid values 0 - 999999999): -1
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }
}
