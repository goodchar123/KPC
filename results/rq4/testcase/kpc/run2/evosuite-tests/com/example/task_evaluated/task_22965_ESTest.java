/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 18:19:23 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_22965;
import java.awt.Font;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_22965_ESTest extends task_22965_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_22965 task_22965_0 = new task_22965();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex("6Ya", (Font) null, 0, 0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Font font0 = Font.decode("");
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex("", font0, (-3360), (-3360));
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid start index: -3360
         //
         verifyException("com.example.task_evaluated.task_22965", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex("", (Font) null, 1, 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid start index: 1
         //
         verifyException("com.example.task_evaluated.task_22965", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Font font0 = new Font("Invalid start index: ", 0, 0);
      // Undeclared exception!
      try { 
        task_22965.findBreakIndex((String) null, font0, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_22965", e);
      }
  }
}
