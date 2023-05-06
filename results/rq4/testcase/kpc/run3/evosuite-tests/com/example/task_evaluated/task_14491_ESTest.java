/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:17:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14491;
import java.time.Instant;
import java.util.Date;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.evosuite.runtime.mock.java.util.MockDate;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14491_ESTest extends task_14491_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14491 task_14491_0 = new task_14491();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14491.isDateAfter((Date) null, (Date) null);
      } catch(NullPointerException e) {
         //
         // Date cannot be null
         //
         verifyException("com.example.task_evaluated.task_14491", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Date date0 = Date.from(instant0);
      boolean boolean0 = task_14491.isDateAfter(date0, date0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockDate mockDate0 = new MockDate((-532), 0, (-2902));
      // Undeclared exception!
      try { 
        task_14491.isDateAfter(mockDate0, (Date) null);
      } catch(NullPointerException e) {
         //
         // Date cannot be null
         //
         verifyException("com.example.task_evaluated.task_14491", e);
      }
  }
}
