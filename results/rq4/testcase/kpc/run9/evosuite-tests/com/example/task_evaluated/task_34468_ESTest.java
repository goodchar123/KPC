/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:46:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_34468;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_34468_ESTest extends task_34468_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_34468 task_34468_0 = new task_34468();
      task_34468_0.setLockingKeyState(0, false);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_34468 task_34468_0 = new task_34468();
      task_34468_0.setLockingKeyState(3862, true);
  }
}
