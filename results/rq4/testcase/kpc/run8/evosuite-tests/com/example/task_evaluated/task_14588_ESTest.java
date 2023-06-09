/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:13:15 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14588;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.util.SystemInUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14588_ESTest extends task_14588_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14588 task_14588_0 = new task_14588();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SystemInUtil.addInputLine("5");
      String[] stringArray0 = new String[4];
      task_14588.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        task_14588.main(stringArray0);
      } catch(NoSuchElementException e) {
         //
         // Input is exhausted for java.util.Scanner.nextLong()
         //
         verifyException("com.example.task_evaluated.task_14588", e);
      }
  }
}
