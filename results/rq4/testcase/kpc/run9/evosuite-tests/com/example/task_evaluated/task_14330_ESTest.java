/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:36:11 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_14330;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14330_ESTest extends task_14330_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      task_14330.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14330.ListIteratorExample task_14330_ListIteratorExample0 = new task_14330.ListIteratorExample();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14330 task_14330_0 = new task_14330();
  }
}
