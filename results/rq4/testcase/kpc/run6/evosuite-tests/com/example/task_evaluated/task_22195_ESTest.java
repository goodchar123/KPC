/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:35:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_22195;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_22195_ESTest extends task_22195_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = task_22195.deepClone("com.example.task_evaluated.task_22195");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_22195 task_22195_0 = new task_22195();
  }
}
