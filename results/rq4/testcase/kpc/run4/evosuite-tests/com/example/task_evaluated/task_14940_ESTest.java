/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:52:39 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14940;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14940_ESTest extends task_14940_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14940 task_14940_0 = new task_14940();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      Set<Object> set0 = task_14940.getUnmodifiableSet(objectArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14940.getUnmodifiableSet((Integer[]) null);
      } catch(NullPointerException e) {
         //
         // Array cannot be null
         //
         verifyException("com.example.task_evaluated.task_14940", e);
      }
  }
}
