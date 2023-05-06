/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:24:38 GMT 2023
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
      double[] doubleArray0 = new double[3];
      Vector<Double> vector0 = new Vector<Double>();
      boolean boolean0 = vector0.add((Double) 0.0);
      task_1841.storeVector(doubleArray0, 0, vector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      Vector<Double> vector0 = new Vector<Double>();
      boolean boolean0 = vector0.add((Double) null);
      // Undeclared exception!
      try { 
        task_1841.storeVector(doubleArray0, (-889), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: -889
         //
         verifyException("com.example.task_evaluated.task_1841", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      Vector<Double> vector0 = new Vector<Double>();
      boolean boolean0 = vector0.add((Double) 0.0);
      // Undeclared exception!
      try { 
        task_1841.storeVector(doubleArray0, 1762, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: 1762
         //
         verifyException("com.example.task_evaluated.task_1841", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1841.storeVector((double[]) null, 2063, (Vector<Double>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1841", e);
      }
  }
}
