/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:17:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13540;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13540_ESTest extends task_13540_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13540 task_13540_0 = new task_13540();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      boolean[] booleanArray1 = task_13540.copyArray(booleanArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      boolean[] booleanArray1 = task_13540.copyArray(booleanArray0, 3254);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[4];
      // Undeclared exception!
      try { 
        task_13540.copyArray(booleanArray0, (-3582));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13540.copyArray((boolean[]) null, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }
}
