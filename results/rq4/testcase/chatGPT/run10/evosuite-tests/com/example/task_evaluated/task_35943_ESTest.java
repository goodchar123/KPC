/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:10:00 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35943;
import java.awt.AWTException;
import java.awt.Point;
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
      Point point0 = new Point();
      Rectangle rectangle0 = new Rectangle(point0);
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
