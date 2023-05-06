/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:11:14 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31655;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31655_ESTest extends task_31655_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31655 task_31655_0 = new task_31655();
      try { 
        task_31655_0.getMixer(" is not installed on the system.");
      } catch(IllegalArgumentException e) {
         //
         // Mixer with name  is not installed on the system. is not installed on the system.
         //
         verifyException("com.example.task_evaluated.task_31655", e);
      }
  }
}
