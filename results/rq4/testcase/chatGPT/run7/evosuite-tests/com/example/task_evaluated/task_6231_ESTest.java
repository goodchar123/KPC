/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:32:22 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6231;
import java.time.Instant;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6231_ESTest extends task_6231_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6231 task_6231_0 = new task_6231();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      // Undeclared exception!
      try { 
        task_6231.getZonedDateTimeFromInstant((Instant) null, zoneOffset0);
      } catch(NullPointerException e) {
         //
         // instant
         //
         verifyException("java.util.Objects", e);
      }
  }
}
