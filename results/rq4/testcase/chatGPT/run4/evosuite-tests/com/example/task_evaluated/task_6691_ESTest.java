/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:41:12 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6691;
import java.time.DateTimeException;
import java.time.OffsetDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockOffsetDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6691_ESTest extends task_6691_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6691.withMinuteOfHour((OffsetDateTime) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6691", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6691 task_6691_0 = new task_6691();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.now();
      // Undeclared exception!
      try { 
        task_6691.withMinuteOfHour(offsetDateTime0, (-2500));
      } catch(DateTimeException e) {
         //
         // Invalid value for MinuteOfHour (valid values 0 - 59): -2500
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }
}
