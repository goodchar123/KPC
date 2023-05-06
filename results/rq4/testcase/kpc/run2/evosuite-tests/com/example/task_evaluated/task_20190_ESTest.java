/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 16:14:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20190;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20190_ESTest extends task_20190_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      task_20190.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20190 task_20190_0 = new task_20190();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[2] = 4096;
      intArray0[4] = (-1);
      // Undeclared exception!
      try { 
        task_20190.allocateMemory(intArray0, intArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[1];
      // Undeclared exception!
      try { 
        task_20190.allocateMemory(intArray0, intArray0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds.
         //
         verifyException("com.example.task_evaluated.task_20190", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[9];
      intArray0[0] = (-2086);
      // Undeclared exception!
      try { 
        task_20190.allocateMemory(intArray0, intArray0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20190", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20190.allocateMemory((int[]) null, (int[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[1] = 4096;
      intArray0[5] = 8192;
      // Undeclared exception!
      task_20190.allocateMemory(intArray0, intArray0);
  }
}
