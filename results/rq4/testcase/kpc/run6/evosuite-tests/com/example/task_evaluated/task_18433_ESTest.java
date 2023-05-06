/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:17:40 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18433;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18433_ESTest extends task_18433_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18433 task_18433_0 = new task_18433();
      String string0 = task_18433_0.getBorderBottomColor("ES!?");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18433 task_18433_0 = new task_18433();
      String string0 = task_18433_0.getBorderBottomColor("So:rd=@");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_18433 task_18433_0 = new task_18433();
      // Undeclared exception!
      try { 
        task_18433_0.getBorderBottomColor((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18433", e);
      }
  }
}
