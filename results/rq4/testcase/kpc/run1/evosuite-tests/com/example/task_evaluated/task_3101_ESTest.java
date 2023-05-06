/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 16:29:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_3101;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_3101_ESTest extends task_3101_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_3101 task_3101_0 = new task_3101();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        task_3101.isSubtype((Class<?>) null, class0);
      } catch(NullPointerException e) {
         //
         // Type or supertype cannot be null
         //
         verifyException("com.example.task_evaluated.task_3101", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        task_3101.isSubtype(class0, (Class<?>) null);
      } catch(NullPointerException e) {
         //
         // Type or supertype cannot be null
         //
         verifyException("com.example.task_evaluated.task_3101", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = task_3101.isSubtype(class0, class0);
  }
}