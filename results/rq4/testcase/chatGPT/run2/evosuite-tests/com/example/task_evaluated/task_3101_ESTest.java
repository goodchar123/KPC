/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:09:05 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_3101;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_3101_ESTest extends task_3101_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Object> class0 = Object.class;
      boolean boolean0 = task_3101.isSubtype(class0, class0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_3101 task_3101_0 = new task_3101();
  }
}
