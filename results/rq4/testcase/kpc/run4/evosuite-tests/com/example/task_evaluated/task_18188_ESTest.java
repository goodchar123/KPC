/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:36:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18188;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18188_ESTest extends task_18188_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18188 task_18188_0 = new task_18188();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      try { 
        task_18188.loadAgentLibrary((String) null);
      } catch(NullPointerException e) {
         //
         // library can't be null
         //
         verifyException("java.lang.SecurityManager", e);
      }
  }
}
