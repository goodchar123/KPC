/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:26:21 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2586;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2586_ESTest extends task_2586_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2586 task_2586_0 = new task_2586();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Double> vector0 = new Vector<Double>();
      Double double0 = new Double(0.0);
      boolean boolean0 = vector0.add(double0);
      boolean boolean1 = vector0.add(double0);
      task_2586.replaceLane(vector0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_2586.replaceLane((Vector<Double>) null, 260, 260);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2586", e);
      }
  }
}
