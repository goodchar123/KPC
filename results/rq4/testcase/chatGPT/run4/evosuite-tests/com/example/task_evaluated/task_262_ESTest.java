/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:33:34 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_262;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.javax.naming.MockInitialContext;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_262_ESTest extends task_262_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_262 task_262_0 = new task_262();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockInitialContext mockInitialContext0 = new MockInitialContext();
      // Undeclared exception!
      try { 
        task_262.getContextInitiatorName(mockInitialContext0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_262", e);
      }
  }
}
