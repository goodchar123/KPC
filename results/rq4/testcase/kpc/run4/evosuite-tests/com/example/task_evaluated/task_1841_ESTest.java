/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:49:20 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1841;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1841_ESTest extends task_1841_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1841 task_1841_0 = new task_1841();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[0];
      Vector<Double> vector0 = new Vector<Double>(303, 0);
      boolean boolean0 = vector0.add((Double) null);
      // Undeclared exception!
      try { 
        task_1841.storeVector(doubleArray0, (-2004), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: -2004
         //
         verifyException("com.example.task_evaluated.task_1841", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Vector<Double> vector0 = new Vector<Double>();
      boolean boolean0 = vector0.add((Double) (-560.054821283));
      task_1841.storeVector(doubleArray0, 0, vector0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[5];
      Vector<Double> vector0 = new Vector<Double>();
      boolean boolean0 = vector0.add((Double) (-560.054821283));
      // Undeclared exception!
      try { 
        task_1841.storeVector(doubleArray0, 2534, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: 2534
         //
         verifyException("com.example.task_evaluated.task_1841", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      // Undeclared exception!
      try { 
        task_1841.storeVector(doubleArray0, (-301), (Vector<Double>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1841", e);
      }
  }
}