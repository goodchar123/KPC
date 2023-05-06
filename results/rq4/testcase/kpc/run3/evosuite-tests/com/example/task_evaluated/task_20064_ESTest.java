/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:35:40 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20064;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20064_ESTest extends task_20064_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20064 task_20064_0 = new task_20064();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = task_20064.copyMemorySegment(byteArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_20064.copyMemorySegment((byte[]) null);
      } catch(NullPointerException e) {
         //
         // Memory segment cannot be null
         //
         verifyException("com.example.task_evaluated.task_20064", e);
      }
  }
}
