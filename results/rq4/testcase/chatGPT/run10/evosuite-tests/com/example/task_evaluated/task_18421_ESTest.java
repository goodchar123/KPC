/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:02:22 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18421;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18421_ESTest extends task_18421_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18421 task_18421_0 = new task_18421();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_18421.getBorderTop(":");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_18421.getBorderTop("V,a]0dQA:X6p4v<>H2@");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18421.getBorderTop((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18421", e);
      }
  }
}
