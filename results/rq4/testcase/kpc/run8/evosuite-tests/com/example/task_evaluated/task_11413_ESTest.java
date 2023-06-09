/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:54:08 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_11413;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_11413_ESTest extends task_11413_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_11413 task_11413_0 = new task_11413();
      StringBuffer stringBuffer0 = new StringBuffer("");
      // Undeclared exception!
      try { 
        task_11413_0.appendSubsequence(stringBuffer0, stringBuffer0, (-1573), (-1573));
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11413", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_11413 task_11413_0 = new task_11413();
      StringBuffer stringBuffer0 = new StringBuffer(0);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      task_11413_0.appendSubsequence(stringBuffer0, charBuffer0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_11413 task_11413_0 = new task_11413();
      StringBuffer stringBuffer0 = new StringBuffer("Zf^$/}eJ");
      // Undeclared exception!
      try { 
        task_11413_0.appendSubsequence(stringBuffer0, stringBuffer0, 1693, (-4347));
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11413", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_11413 task_11413_0 = new task_11413();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      StringBuffer stringBuffer0 = new StringBuffer(charBuffer0);
      // Undeclared exception!
      try { 
        task_11413_0.appendSubsequence(stringBuffer0, stringBuffer0, 0, 1330);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11413", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_11413 task_11413_0 = new task_11413();
      // Undeclared exception!
      try { 
        task_11413_0.appendSubsequence((StringBuffer) null, (CharSequence) null, 229, 1054);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11413", e);
      }
  }
}
