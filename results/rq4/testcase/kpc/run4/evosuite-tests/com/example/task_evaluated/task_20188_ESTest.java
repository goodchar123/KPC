/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:25:20 GMT 2023
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
      int[] intArray0 = new int[0];
      long[] longArray0 = new long[0];
      long[] longArray1 = task_20188.allocateAndInitializeMemory(intArray0, longArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[0] = 1;
      intArray0[1] = (-1873);
      intArray0[2] = (-1621);
      intArray0[3] = (-1618);
      long[] longArray0 = new long[1];
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
      long[] longArray0 = new long[8];
      int[] intArray0 = new int[1];
      intArray0[0] = (-1288);
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
      int[] intArray0 = new int[7];
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
      long[] longArray0 = new long[9];
      // Undeclared exception!
      try { 
        task_20188.allocateAndInitializeMemory((int[]) null, longArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[0] = (-1);
      intArray0[1] = (-1559);
      intArray0[2] = (-1);
      intArray0[3] = 1;
      intArray0[4] = 1;
      intArray0[5] = (-618);
      long[] longArray0 = new long[5];
      // Undeclared exception!
      task_20188.allocateAndInitializeMemory(intArray0, longArray0);
  }
}
