/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:23:42 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18521;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18521_ESTest extends task_18521_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18521 task_18521_0 = new task_18521();
      String string0 = task_18521_0.getMarginDefinition("WsG=1");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18521 task_18521_0 = new task_18521();
      String string0 = task_18521_0.getMarginDefinition("margin:");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18521 task_18521_0 = new task_18521();
      // Undeclared exception!
      try { 
        task_18521_0.getMarginDefinition((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18521", e);
      }
  }
}
