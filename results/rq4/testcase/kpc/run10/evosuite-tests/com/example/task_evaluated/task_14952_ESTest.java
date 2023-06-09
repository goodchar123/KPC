/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 16:59:12 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14952;
import java.util.Spliterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14952_ESTest extends task_14952_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14952 task_14952_0 = new task_14952();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Spliterator.OfDouble spliterator_OfDouble0 = task_14952.createCustomSpliterator(doubleArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14952.createCustomSpliterator((double[]) null);
      } catch(NullPointerException e) {
         //
         // Array cannot be null
         //
         verifyException("com.example.task_evaluated.task_14952", e);
      }
  }
}
