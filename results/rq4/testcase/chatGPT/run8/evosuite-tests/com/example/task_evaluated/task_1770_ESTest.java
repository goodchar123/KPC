/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:37:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1770;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1770_ESTest extends task_1770_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1770 task_1770_0 = new task_1770();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      float[] floatArray0 = new float[5];
      boolean[] booleanArray0 = new boolean[3];
      booleanArray0[0] = true;
      float[] floatArray1 = task_1770.combineVectors(floatArray0, floatArray0, 0.0F, booleanArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      float[] floatArray0 = new float[7];
      // Undeclared exception!
      try { 
        task_1770.combineVectors(floatArray0, floatArray0, 0.0F, (boolean[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1770", e);
      }
  }
}
