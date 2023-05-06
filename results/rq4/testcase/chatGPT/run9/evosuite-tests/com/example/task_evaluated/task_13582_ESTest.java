/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:23:54 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13582;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13582_ESTest extends task_13582_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13582 task_13582_0 = new task_13582();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        task_13582.getSpliterator(stringArray0, (-375), (-375));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: -375
         //
         verifyException("java.util.Spliterators", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13582.getSpliterator((String[]) null, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}