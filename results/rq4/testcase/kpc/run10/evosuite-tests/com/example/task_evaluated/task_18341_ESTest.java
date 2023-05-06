/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:46:13 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18341;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18341_ESTest extends task_18341_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18341 task_18341_0 = new task_18341();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_18341.removeCSSProperty("3KBR3?DI", "3KBR3?DI");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_18341.removeCSSProperty("PYL:0^DpTG>62LNE%5", "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_18341.removeCSSProperty(":q[+Vl5^", "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18341.removeCSSProperty((String) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18341", e);
      }
  }
}
