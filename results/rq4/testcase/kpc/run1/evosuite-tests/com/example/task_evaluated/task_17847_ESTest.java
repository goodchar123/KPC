/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 17:53:59 GMT 2023
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
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      String string0 = task_17847.addNameComponents("", stringArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents("Invalid offset: ", stringArray0, (-2045));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: -2045
         //
         verifyException("com.example.task_evaluated.task_17847", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents("com.example.task_evaluated.task_17847", stringArray0, 4686);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: 4686
         //
         verifyException("com.example.task_evaluated.task_17847", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents((String) null, stringArray0, 1);
      } catch(NullPointerException e) {
      }
  }
}