/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 17:37:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35943;
import java.awt.AWTException;
import java.awt.Rectangle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35943_ESTest extends task_35943_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35943 task_35943_0 = new task_35943();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle();
      // Undeclared exception!
      try { 
        task_35943.captureScreen(rectangle0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid screenRect dimensions
         //
         verifyException("com.example.task_evaluated.task_35943", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(6087, (-1));
      // Undeclared exception!
      try { 
        task_35943.captureScreen(rectangle0);
      } catch(IllegalArgumentException e) {
         //
         // Invalid screenRect dimensions
         //
         verifyException("com.example.task_evaluated.task_35943", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Rectangle rectangle0 = new Rectangle(6087, (-1));
      rectangle0.setRect((double) (-1), (double) (-1), (double) 6087, (double) 6087);
      try { 
        task_35943.captureScreen(rectangle0);
      } catch(AWTException e) {
         //
         // headless environment
         //
         verifyException("java.awt.Robot", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_35943.captureScreen((Rectangle) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
