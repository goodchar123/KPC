/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:14:51 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2665;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2665_ESTest extends task_2665_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2665 task_2665_0 = new task_2665();
      Class<Object> class0 = Object.class;
      Object object0 = task_2665.guardedTypeConversion((Object) task_2665_0, class0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        task_2665.guardedTypeConversion((Object) null, class0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2665", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        task_2665.guardedTypeConversion(object0, class0);
      } catch(IllegalArgumentException e) {
         //
         // Cannot convert value of type java.lang.Object to target type java.lang.Integer
         //
         verifyException("com.example.task_evaluated.task_2665", e);
      }
  }
}
