/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:35:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20735;
import java.sql.Timestamp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20735_ESTest extends task_20735_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20735 task_20735_0 = new task_20735();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20735.setNanos((Timestamp) null, (-5691));
      } catch(IllegalArgumentException e) {
         //
         // Nanoseconds value must be between 0 and 999999999
         //
         verifyException("com.example.task_evaluated.task_20735", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20735.setNanos((Timestamp) null, 1000000024);
      } catch(IllegalArgumentException e) {
         //
         // Nanoseconds value must be between 0 and 999999999
         //
         verifyException("com.example.task_evaluated.task_20735", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20735.setNanos((Timestamp) null, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20735", e);
      }
  }
}
