/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:58:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_29558;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_29558_ESTest extends task_29558_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_29558 task_29558_0 = new task_29558();
      // Undeclared exception!
      try { 
        task_29558_0.fetchText("0AAUp6Kxg!#", (-1069), (-1069));
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29558", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_29558 task_29558_0 = new task_29558();
      String string0 = task_29558_0.fetchText("5zo-lt0S\"", 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_29558 task_29558_0 = new task_29558();
      // Undeclared exception!
      try { 
        task_29558_0.fetchText("", 69, 69);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29558", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_29558 task_29558_0 = new task_29558();
      // Undeclared exception!
      try { 
        task_29558_0.fetchText("", 0, (-401));
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29558", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_29558 task_29558_0 = new task_29558();
      // Undeclared exception!
      try { 
        task_29558_0.fetchText((String) null, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_29558", e);
      }
  }
}
