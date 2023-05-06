/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:09:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18187;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18187_ESTest extends task_18187_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18187 task_18187_0 = new task_18187();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        task_18187.loadAgentLibrary((String) null);
      } catch(NullPointerException e) {
         //
         // library can't be null
         //
         verifyException("java.lang.SecurityManager", e);
      }
  }
}
