/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:23:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2150;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2150_ESTest extends task_2150_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[9];
      // Undeclared exception!
      try { 
        task_2150.sliceLanes(intArray0, 0, 0, 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_2150", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_2150 task_2150_0 = new task_2150();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[5];
      int[] intArray1 = task_2150.sliceLanes(intArray0, (-859), (-859), 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        task_2150.sliceLanes(intArray0, 1, 0, 357);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_2150", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[5];
      // Undeclared exception!
      try { 
        task_2150.sliceLanes(intArray0, (-1), 4464, (-1));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2150", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_2150.sliceLanes((int[]) null, 910, 910, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2150", e);
      }
  }
}
