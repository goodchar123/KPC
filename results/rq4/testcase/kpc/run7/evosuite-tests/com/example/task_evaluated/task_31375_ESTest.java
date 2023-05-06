/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:38:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31375;
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
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      task_31375.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AffineTransform affineTransform0 = AffineTransform.getTranslateInstance(0.0, (-333.74));
      // Undeclared exception!
      try { 
        task_31375.createTransformedArea((Area) null, affineTransform0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_31375", e);
      }
  }
}
