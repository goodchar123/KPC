/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:22:46 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18431;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18431_ESTest extends task_18431_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18431 task_18431_0 = new task_18431();
      String string0 = task_18431_0.getBorderRightColor("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18431 task_18431_0 = new task_18431();
      String string0 = task_18431_0.getBorderRightColor("5/1^-L:0lkf!");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18431 task_18431_0 = new task_18431();
      // Undeclared exception!
      try { 
        task_18431_0.getBorderRightColor((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18431", e);
      }
  }
}
