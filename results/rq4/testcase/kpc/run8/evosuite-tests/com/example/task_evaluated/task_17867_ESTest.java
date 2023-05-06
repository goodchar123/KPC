/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:13:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17867;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17867_ESTest extends task_17867_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17867 task_17867_0 = new task_17867();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17867.addComponent("o-%+`6[LY.0ZS0a2G", "", (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid position
         //
         verifyException("com.example.task_evaluated.task_17867", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17867.addComponent(">3~{x4", ">3~{x4", 1879);
      } catch(IllegalArgumentException e) {
         //
         // Invalid position
         //
         verifyException("com.example.task_evaluated.task_17867", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_17867.addComponent("UP..DFrkXw", "43rYv[oi2+r0zV", 1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17867.addComponent((String) null, "] b", (-5069));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17867", e);
      }
  }
}