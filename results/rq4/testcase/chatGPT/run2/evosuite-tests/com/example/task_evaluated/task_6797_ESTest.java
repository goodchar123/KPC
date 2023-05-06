/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:58:04 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6797;
import java.time.DateTimeException;
import java.time.LocalTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalTime;
import org.evosuite.runtime.mock.java.time.MockOffsetTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6797_ESTest extends task_6797_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6797 task_6797_0 = new task_6797();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6797.withSecondOfMinute((OffsetTime) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6797", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      LocalTime localTime0 = MockLocalTime.now((ZoneId) zoneOffset0);
      OffsetTime offsetTime0 = MockOffsetTime.of(localTime0, zoneOffset0);
      // Undeclared exception!
      try { 
        task_6797.withSecondOfMinute(offsetTime0, 391);
      } catch(DateTimeException e) {
         //
         // Invalid value for SecondOfMinute (valid values 0 - 59): 391
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }
}
