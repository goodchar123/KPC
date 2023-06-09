/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:02:00 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17670;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17670_ESTest extends task_17670_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17670 task_17670_0 = new task_17670();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_17670.removeComponentFromLDAPName("", "-79B{y1");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_17670.removeComponentFromLDAPName("", "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_17670.removeComponentFromLDAPName("=j'gB[L<($,,,+o", "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17670.removeComponentFromLDAPName((String) null, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17670", e);
      }
  }
}
