/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:04:56 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6796;
import java.time.DateTimeException;
import java.time.OffsetTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockOffsetTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6796_ESTest extends task_6796_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OffsetTime offsetTime0 = MockOffsetTime.now();
      // Undeclared exception!
      try { 
        task_6796.withMinute(offsetTime0, (-2683));
      } catch(DateTimeException e) {
         //
         // Invalid value for MinuteOfHour (valid values 0 - 59): -2683
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6796 task_6796_0 = new task_6796();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6796.withMinute((OffsetTime) null, (-459));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6796", e);
      }
  }
}
