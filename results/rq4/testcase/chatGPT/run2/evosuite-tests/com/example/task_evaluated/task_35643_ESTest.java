/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:57:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_35643;
import java.awt.FocusTraversalPolicy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_35643_ESTest extends task_35643_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_35643 task_35643_0 = new task_35643();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_35643.setDefaultFocusTraversalPolicy((FocusTraversalPolicy) null);
      } catch(IllegalArgumentException e) {
         //
         // default focus traversal policy cannot be null
         //
         verifyException("java.awt.KeyboardFocusManager", e);
      }
  }
}
