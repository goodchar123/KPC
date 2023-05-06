/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:35:44 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6267;
import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockZonedDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6267_ESTest extends task_6267_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MAX;
      ZonedDateTime zonedDateTime0 = MockZonedDateTime.now((ZoneId) zoneOffset0);
      // Undeclared exception!
      try { 
        task_6267.withDayOfYear(zonedDateTime0, 0);
      } catch(DateTimeException e) {
         //
         // Invalid value for DayOfYear (valid values 1 - 365/366): 0
         //
         verifyException("java.time.temporal.ValueRange", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6267 task_6267_0 = new task_6267();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6267.withDayOfYear((ZonedDateTime) null, (-592));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6267", e);
      }
  }
}
