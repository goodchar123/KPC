/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 04:45:56 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_17882;
import javax.naming.CompositeName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_17882_ESTest extends task_17882_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_17882 task_17882_0 = new task_17882();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CompositeName compositeName0 = new CompositeName("`]2tL>[<f/({/SYoUSF");
      // Undeclared exception!
      try { 
        task_17882.createCompositeNameWithPrefix(compositeName0, (-34));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Prefix length is outside the specified range.
         //
         verifyException("com.example.task_evaluated.task_17882", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CompositeName compositeName0 = new CompositeName("`]2tL>[<f/({/SYoUSF");
      String string0 = task_17882.createCompositeNameWithPrefix(compositeName0, 1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CompositeName compositeName0 = new CompositeName("");
      // Undeclared exception!
      try { 
        task_17882.createCompositeNameWithPrefix(compositeName0, 4491);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Prefix length is outside the specified range.
         //
         verifyException("com.example.task_evaluated.task_17882", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_17882.createCompositeNameWithPrefix((CompositeName) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_17882", e);
      }
  }
}
