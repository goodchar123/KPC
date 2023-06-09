/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:41:07 GMT 2023
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
      float[] floatArray0 = new float[1];
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray((Vector<Float>) null, floatArray0, 0);
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
        task_2599.storeVectorIntoArray(vector0, (float[]) null, 0);
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
      float[] floatArray0 = new float[1];
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, (-66));
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset is out of range: -66
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[9];
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, 1063);
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset is out of range: 1063
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[3];
      Float float0 = new Float(0.0F);
      boolean boolean0 = vector0.add(float0);
      boolean boolean1 = vector0.add(float0);
      boolean boolean2 = vector0.add((Float) 2441.65F);
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, 1);
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
      float[] floatArray0 = new float[1];
      vector0.insertElementAt((Float) null, 0);
      // Undeclared exception!
      try { 
        task_2599.storeVectorIntoArray(vector0, floatArray0, 0);
      } catch(ArrayStoreException e) {
         //
         // Type mismatch: null
         //
         verifyException("com.example.task_evaluated.task_2599", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      float[] floatArray0 = new float[1];
      Float float0 = new Float(1.0);
      boolean boolean0 = vector0.add(float0);
      task_2599.storeVectorIntoArray(vector0, floatArray0, 0);
  }
}
