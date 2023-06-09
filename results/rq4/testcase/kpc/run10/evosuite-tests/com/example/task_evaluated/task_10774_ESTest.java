/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:30:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10774;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10774_ESTest extends task_10774_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10774 task_10774_0 = new task_10774();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10774.addAttributeToString("U", (-1547), (-1547), "U");
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10774", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_10774.addAttributeToString("-{9jioI", 0, 0, "com.example.task_evaluated.task_10774");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10774.addAttributeToString("", 167, 1811, "");
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10774", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10774.addAttributeToString("<)|uD]=R0?(P;kM`hFl`></)|uD]=R0?(P;kM`hFl`>)|uD]=R0?(P;kM`hFl`", 2204, (-391), ")|uD]=R0?(P;kM`hFl`");
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10774", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10774.addAttributeToString((String) null, 1415, (-3101), (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10774", e);
      }
  }
}
