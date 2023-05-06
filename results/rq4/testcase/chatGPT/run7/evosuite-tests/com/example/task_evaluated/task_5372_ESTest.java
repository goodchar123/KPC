/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:58:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_5372;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_5372_ESTest extends task_5372_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_5372 task_5372_0 = new task_5372();
      // Undeclared exception!
      try { 
        task_5372_0.nodeExists("g?=GhQl// e");
      } catch(IllegalArgumentException e) {
         //
         // Consecutive slashes in path
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_5372 task_5372_0 = new task_5372();
      // Undeclared exception!
      try { 
        task_5372_0.nodeExists((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.prefs.AbstractPreferences", e);
      }
  }
}
