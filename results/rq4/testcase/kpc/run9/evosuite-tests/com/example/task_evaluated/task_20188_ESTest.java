/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:13:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20188;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20188_ESTest extends task_20188_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20188 task_20188_0 = new task_20188();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 1;
      intArray0[1] = 6098;
      long[] longArray0 = new long[9];
      long[] longArray1 = task_20188.allocateAndInitializeMemory(intArray0, longArray0);
      // Undeclared exception!
      task_20188.allocateAndInitializeMemory(intArray0, longArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 1830;
      intArray0[1] = (-1375);
      intArray0[2] = (-1245);
      long[] longArray0 = new long[2];
      // Undeclared exception!
      try { 
        task_20188.allocateAndInitializeMemory(intArray0, longArray0);
      } catch(ArithmeticException e) {
         //
         // Integer overflow occurred when calculating memory block size.
         //
         verifyException("com.example.task_evaluated.task_20188", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = (-805);
      long[] longArray0 = new long[8];
      // Undeclared exception!
      try { 
        task_20188.allocateAndInitializeMemory(intArray0, longArray0);
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_20188", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[4];
      // Undeclared exception!
      try { 
        task_20188.allocateAndInitializeMemory(intArray0, (long[]) null);
      } catch(NullPointerException e) {
         //
         // Either src or dest is null.
         //
         verifyException("com.example.task_evaluated.task_20188", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20188.allocateAndInitializeMemory((int[]) null, (long[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
