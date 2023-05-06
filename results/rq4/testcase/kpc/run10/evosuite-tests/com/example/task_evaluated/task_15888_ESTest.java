/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:38:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15888;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15888_ESTest extends task_15888_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15888 task_15888_0 = new task_15888();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_15888.checkFileExists((String) null);
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
         verifyException("java.io.FilePermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      boolean boolean0 = task_15888.checkFileExists("");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      try { 
        task_15888.checkFileExists("J>X");
      } catch(SecurityException e) {
         //
         // Access denied to file: J>X
         //
         verifyException("com.example.task_evaluated.task_15888", e);
      }
  }
}
