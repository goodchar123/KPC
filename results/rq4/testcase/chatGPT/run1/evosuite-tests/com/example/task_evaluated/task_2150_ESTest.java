/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:41:35 GMT 2023
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
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        task_2150.sliceLanes(intArray0, 0, 0, 2579);
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
      int[] intArray0 = new int[2];
      int[] intArray1 = task_2150.sliceLanes(intArray0, 0, (-1048), 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        task_2150.sliceLanes(intArray0, 755, 1, 1307);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_2150", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[2];
      // Undeclared exception!
      try { 
        task_2150.sliceLanes(intArray0, (-5014), (-842), (-1048));
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
        task_2150.sliceLanes((int[]) null, 919, 919, 919);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2150", e);
      }
  }
}
