/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:58:37 GMT 2023
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
      Rectangle rectangle0 = new Rectangle((-1572), (-1572), (-1), 0);
      try { 
        task_35943.captureScreen(rectangle0);
      } catch(AWTException e) {
         //
         // headless environment
         //
         verifyException("java.awt.Robot", e);
      }
  }
}
