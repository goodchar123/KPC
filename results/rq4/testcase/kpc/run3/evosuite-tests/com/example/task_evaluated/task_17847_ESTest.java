/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 05:47:53 GMT 2023
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
      String[] stringArray0 = new String[6];
      stringArray0[0] = "0W~r";
      stringArray0[1] = "`BJiHY$c_29.|bc";
      stringArray0[2] = "`BJiHY$c_29.|bc";
      stringArray0[3] = "`BJiHY$c_29.|bc";
      stringArray0[4] = "`BJiHY$c_29.|bc";
      stringArray0[5] = "";
      String string0 = task_17847.addNameComponents("`BJiHY$c_29.|bc", stringArray0, 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents("c", stringArray0, (-3426));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: -3426
         //
         verifyException("com.example.task_evaluated.task_17847", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents("UQ", stringArray0, 27);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: 27
         //
         verifyException("com.example.task_evaluated.task_17847", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17847.addNameComponents("hs\u0002KK", (String[]) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17847", e);
      }
  }
}
