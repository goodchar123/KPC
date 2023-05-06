/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:11:57 GMT 2023
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
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<String> class0 = String.class;
      String string0 = task_2665.guardedTypeConversion((Object) "", class0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        task_2665.guardedTypeConversion((Object) null, class0);
      } catch(NullPointerException e) {
         //
         // Value cannot be null
         //
         verifyException("com.example.task_evaluated.task_2665", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        task_2665.guardedTypeConversion((Object) "", class0);
      } catch(ClassCastException e) {
         //
         // Cannot convert value of type java.lang.String to target type java.lang.Integer
         //
         verifyException("com.example.task_evaluated.task_2665", e);
      }
  }
}
