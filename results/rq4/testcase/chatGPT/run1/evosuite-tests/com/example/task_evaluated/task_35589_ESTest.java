/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:11:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35589;
import java.awt.Font;
import java.awt.geom.AffineTransform;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35589_ESTest extends task_35589_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35589 task_35589_0 = new task_35589();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AffineTransform affineTransform0 = AffineTransform.getQuadrantRotateInstance(972, (-1520.5017523), (-926.91715));
      // Undeclared exception!
      try { 
        task_35589.createNewFont((Font) null, 972, affineTransform0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35589", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Font font0 = new Font("ig}$", (-1), (-1));
      // Undeclared exception!
      try { 
        task_35589.createNewFont(font0, 1, (AffineTransform) null);
      } catch(IllegalArgumentException e) {
         //
         // transform must not be null
         //
         verifyException("java.awt.Font", e);
      }
  }
}
