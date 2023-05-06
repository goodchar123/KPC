/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:21:16 GMT 2023
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
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray((Vector<Float>) null, (float[]) null, 1);
      } catch(NullPointerException e) {
         //
         // Vector or array is null
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, (float[]) null, (-535));
      } catch(NullPointerException e) {
         //
         // Vector or array is null
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, (-4073));
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset is out of range: -4073
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[0];
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset is out of range: 0
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[3];
      vector0.setSize(792);
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[2];
      boolean boolean0 = vector0.add((Float) floatArray0[1]);
      task_2599.storeVectorIntoArray(vector0, floatArray0, 0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      boolean boolean0 = vector0.add((Float) null);
      float[] floatArray0 = new float[3];
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, 1);
      } catch(ArrayStoreException e) {
         //
         // Type mismatch: null
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }
}
