/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:12:12 GMT 2023
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
      // Undeclared exception!
      try { 
        task_35589.createNewFont((Font) null, 425, (AffineTransform) null);
      } catch(IllegalArgumentException e) {
         //
         // Transform cannot be null
         //
         verifyException("com.example.task_evaluated.task_35589", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AffineTransform affineTransform0 = new AffineTransform(0, 0, 1607.55427, 16.43312628, 1607.55427, 0);
      // Undeclared exception!
      try { 
        task_35589.createNewFont((Font) null, 0, affineTransform0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_35589", e);
      }
  }
}
