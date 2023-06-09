/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:42:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2599;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2599_ESTest extends task_2599_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2599 task_2599_0 = new task_2599();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[0];
      task_2599.storeVectorIntoArray(vector0, floatArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[0];
      Float float0 = new Float((double) 1);
      boolean boolean0 = vector0.add(float0);
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, 1);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      float[] floatArray0 = new float[7];
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray((Vector<Float>) null, floatArray0, (-1313));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }
}
