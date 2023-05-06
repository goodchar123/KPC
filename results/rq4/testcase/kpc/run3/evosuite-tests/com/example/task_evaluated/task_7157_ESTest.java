/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 05:14:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7157;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_7157_ESTest extends task_7157_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_7157 task_7157_0 = new task_7157();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = task_7157.floorMod(585, (-1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7157.floorMod(2004, 0);
      } catch(ArithmeticException e) {
         //
         // Divisor cannot be zero
         //
         verifyException("com.example.task_evaluated.task_7157", e);
      }
  }
}
