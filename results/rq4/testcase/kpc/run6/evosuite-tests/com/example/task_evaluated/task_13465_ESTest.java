/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:44:59 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13465;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13465_ESTest extends task_13465_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13465 task_13465_0 = new task_13465(1);
      int int0 = task_13465_0.compareTo(task_13465_0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_13465 task_13465_0 = new task_13465(1760);
      // Undeclared exception!
      try { 
        task_13465_0.compareTo((task_13465) null);
      } catch(NullPointerException e) {
         //
         // Cannot compare to null object
         //
         verifyException("com.example.task_evaluated.task_13465", e);
      }
  }
}
