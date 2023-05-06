/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:30:22 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6190;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6190_ESTest extends task_6190_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      try { 
        task_6190.getYearFromString("");
      } catch(NumberFormatException e) {
         //
         // Invalid year string: 
         //
         verifyException("com.example.task_evaluated.task_6190", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6190 task_6190_0 = new task_6190();
  }
}
