/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:30:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_16150;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16150_ESTest extends task_16150_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16150 task_16150_0 = new task_16150();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_16150.main((String[]) null);
  }
}
