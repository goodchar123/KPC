/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:35:23 GMT 2023
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
      String[] stringArray0 = new String[4];
      stringArray0[0] = "J,%gx\"";
      stringArray0[1] = "J,%gx\"";
      stringArray0[2] = "J,%gx\"";
      stringArray0[3] = "J,%gx\"";
      String string0 = task_17847.addNameComponents("J,%gx\"", stringArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents((String) null, stringArray0, 0);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        task_17847.addNameComponents(" ", stringArray0, (-1905));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1905
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
}