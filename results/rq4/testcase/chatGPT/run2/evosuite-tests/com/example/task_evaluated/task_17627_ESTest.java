/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:47:31 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17627;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17627_ESTest extends task_17627_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17627 task_17627_0 = new task_17627();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17627.negotiateTLSSession("", (-2668));
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-2668
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }
}
