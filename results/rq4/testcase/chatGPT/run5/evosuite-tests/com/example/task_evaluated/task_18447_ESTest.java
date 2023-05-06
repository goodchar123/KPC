/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:40:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18447;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18447_ESTest extends task_18447_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18447 task_18447_0 = new task_18447();
      String string0 = task_18447_0.getBorderRightWidth("");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18447 task_18447_0 = new task_18447();
      String string0 = task_18447_0.getBorderRightWidth("_orfes,si`iq)tj`ri:c");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18447 task_18447_0 = new task_18447();
      // Undeclared exception!
      try { 
        task_18447_0.getBorderRightWidth((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18447", e);
      }
  }
}
