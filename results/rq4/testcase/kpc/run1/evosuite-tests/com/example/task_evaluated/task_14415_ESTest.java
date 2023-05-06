/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 21:51:01 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14415;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14415_ESTest extends task_14415_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14415 task_14415_0 = new task_14415();
      task_14415_0.setLanguage("?_lrvOi(p");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14415 task_14415_0 = new task_14415();
      try { 
        task_14415_0.setLanguage((String) null);
      } catch(NullPointerException e) {
         //
         // Language cannot be null
         //
         verifyException("com.example.task_evaluated.task_14415", e);
      }
  }
}
