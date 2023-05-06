/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:36:35 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7724;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_7724_ESTest extends task_7724_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_7724 task_7724_0 = new task_7724();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      // Undeclared exception!
      try { 
        task_7724.insertSubsequence(stringBuilder0, (-3023), stringBuilder0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid offset: -3023
         //
         verifyException("com.example.task_evaluated.task_7724", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      task_7724.insertSubsequence(stringBuilder0, 0, stringBuilder0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringBuffer stringBuffer0 = new StringBuffer(0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0, 0, 0);
      StringBuilder stringBuilder0 = new StringBuilder(charBuffer0);
      // Undeclared exception!
      try { 
        task_7724.insertSubsequence(stringBuilder0, 3376, stringBuilder0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Invalid offset: 3376
         //
         verifyException("com.example.task_evaluated.task_7724", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7724.insertSubsequence((CharSequence) null, 0, (StringBuilder) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_7724", e);
      }
  }
}
