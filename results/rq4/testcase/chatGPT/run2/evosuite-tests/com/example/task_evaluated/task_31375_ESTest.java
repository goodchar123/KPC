/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:10:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31375;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31375_ESTest extends task_31375_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31375 task_31375_0 = new task_31375();
      Rectangle rectangle0 = new Rectangle(766, 1204, 0, 766);
      Area area0 = new Area(rectangle0);
      // Undeclared exception!
      try { 
        task_31375_0.createTransformedArea(area0, (AffineTransform) null);
      } catch(NullPointerException e) {
         //
         // transform must not be null
         //
         verifyException("java.awt.geom.Area", e);
      }
  }
}
