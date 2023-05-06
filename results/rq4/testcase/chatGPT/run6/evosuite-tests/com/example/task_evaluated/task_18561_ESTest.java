/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:13:56 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18561;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18561_ESTest extends task_18561_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18561 task_18561_0 = new task_18561();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_18561.getPaddingBottom(":<9`S}g)");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_18561.getPaddingBottom("sU~U");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18561.getPaddingBottom((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18561", e);
      }
  }
}
