/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:20:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1826;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1826_ESTest extends task_1826_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1826 task_1826_0 = new task_1826();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Float> vector0 = new Vector<Float>();
      Float float0 = new Float((-1195.4679F));
      boolean boolean0 = vector0.add(float0);
      boolean boolean1 = vector0.add(float0);
      float float1 = task_1826.accumulateSelectedLanes(vector0, 1178);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1826.accumulateSelectedLanes((Vector<Float>) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1826", e);
      }
  }
}
