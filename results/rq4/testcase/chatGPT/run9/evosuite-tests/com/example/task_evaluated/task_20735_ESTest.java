/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:12:38 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20735;
import java.sql.Timestamp;
import java.time.Instant;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockInstant;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20735_ESTest extends task_20735_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20735 task_20735_0 = new task_20735();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Instant instant0 = MockInstant.now();
      Timestamp timestamp0 = Timestamp.from(instant0);
      // Undeclared exception!
      try { 
        task_20735.setNanos(timestamp0, (-1012));
      } catch(IllegalArgumentException e) {
         //
         // nanos > 999999999 or < 0
         //
         verifyException("java.sql.Timestamp", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20735.setNanos((Timestamp) null, 3199);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20735", e);
      }
  }
}
