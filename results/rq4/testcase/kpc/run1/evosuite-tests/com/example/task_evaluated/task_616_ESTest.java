/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:31:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_616;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_616_ESTest extends task_616_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_616 task_616_0 = new task_616();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_616.getClassPath();
      } catch(SecurityException e) {
         //
         // Caller's class loader is not the same as or an ancestor of the system class loader
         //
         verifyException("com.example.task_evaluated.task_616", e);
      }
  }
}
