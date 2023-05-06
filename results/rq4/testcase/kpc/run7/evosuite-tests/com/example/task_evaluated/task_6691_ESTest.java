/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:01:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6691;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.time.MockOffsetDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6691_ESTest extends task_6691_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_6691.withMinuteOfHour((OffsetDateTime) null, (-1713));
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
      Instant instant0 = MockInstant.ofEpochSecond(0L);
      ZoneOffset zoneOffset0 = ZoneOffset.ofHours(0);
      OffsetDateTime offsetDateTime0 = MockOffsetDateTime.ofInstant(instant0, zoneOffset0);
      // Undeclared exception!
      try { 
        task_6691.withMinuteOfHour(offsetDateTime0, (-1));
      } catch(DateTimeException e) {
         //
         // Invalid minute value: -1
         //
         verifyException("com.example.task_evaluated.task_6691", e);
      }
  }
}
