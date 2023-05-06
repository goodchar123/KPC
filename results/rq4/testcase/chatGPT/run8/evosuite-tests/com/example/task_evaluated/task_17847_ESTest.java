/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:04:18 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17847;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17847_ESTest extends task_17847_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17847 task_17847_0 = new task_17847();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "k4$.=^sr_u22R]YWe";
      stringArray0[1] = "$^4alza3V?I(9iX";
      stringArray0[2] = "k4$.=^sr_u22R]YWe";
      String string0 = task_17847.addNameComponents("k4$.=^sr_u22R]YWe", stringArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17847.addNameComponents("k4$.=^sr_u22R]YWe", (String[]) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17847", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents("y;RUj-", stringArray0, 402);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 402
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
}