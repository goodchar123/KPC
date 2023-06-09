/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:51:45 GMT 2023
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
  public void test00()  throws Throwable  {
      task_13540 task_13540_0 = new task_13540();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      // Undeclared exception!
      try { 
        task_13540.copyArrayWithPadding(booleanArray0, (-1303));
      } catch(IllegalArgumentException e) {
         //
         // New length cannot be negative
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      boolean[] booleanArray1 = task_13540.copyArrayWithPadding(booleanArray0, 4049);
      boolean[] booleanArray2 = task_13540.copyArrayWithPadding(booleanArray1, 4049);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      // Undeclared exception!
      try { 
        task_13540.fill(booleanArray0, 4049, 4049, true);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // fromIndex or toIndex is out of bounds
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      // Undeclared exception!
      try { 
        task_13540.fill(booleanArray0, 4049, (-581), true);
      } catch(IllegalArgumentException e) {
         //
         // fromIndex cannot be greater than toIndex
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      // Undeclared exception!
      try { 
        task_13540.fill(booleanArray0, (-431), (-431), false);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // fromIndex or toIndex is out of bounds
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[5];
      boolean[] booleanArray1 = task_13540.copyArrayWithPadding(booleanArray0, 4049);
      task_13540.fill(booleanArray1, 4049, 4049, true);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean[] booleanArray0 = new boolean[6];
      // Undeclared exception!
      try { 
        task_13540.copyArray(booleanArray0, (-1268));
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13540.copyArray((boolean[]) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13540.copyArrayWithPadding((boolean[]) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13540.fill((boolean[]) null, 0, 1992, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13540", e);
      }
  }
}
