/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:40:41 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18189;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18189_ESTest extends task_18189_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18189.loadNativeAgentLibrary((String) null);
      } catch(NullPointerException e) {
         //
         // library can't be null
         //
         verifyException("java.lang.SecurityManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_18189 task_18189_0 = new task_18189();
  }
}
