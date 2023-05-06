/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 23:26:19 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18429;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18429_ESTest extends task_18429_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18429 task_18429_0 = new task_18429();
      String string0 = task_18429_0.getBorderTopColor(")MI?*LD");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18429 task_18429_0 = new task_18429();
      String string0 = task_18429_0.getBorderTopColor("EaKT:+WL+2");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18429 task_18429_0 = new task_18429();
      // Undeclared exception!
      try { 
        task_18429_0.getBorderTopColor((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18429", e);
      }
  }
}