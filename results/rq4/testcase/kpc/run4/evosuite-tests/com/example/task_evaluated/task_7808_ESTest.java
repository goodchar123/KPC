/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:43:19 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7808;
import java.net.URL;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_7808_ESTest extends task_7808_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_7808 task_7808_0 = new task_7808();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      URL uRL0 = task_7808.findResource("");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7808.findResource((String) null);
      } catch(NullPointerException e) {
         //
         // Resource name cannot be null
         //
         verifyException("com.example.task_evaluated.task_7808", e);
      }
  }
}
