/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:05:32 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9792;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9792_ESTest extends task_9792_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9792 task_9792_0 = new task_9792();
      StringWriter stringWriter0 = new StringWriter(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        task_9792_0.appendSubsequence(stringWriter0, charBuffer0, 290, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9792 task_9792_0 = new task_9792();
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        task_9792_0.appendSubsequence((Writer) null, charBuffer0, 2752, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9792", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_9792 task_9792_0 = new task_9792();
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        task_9792_0.appendSubsequence(stringWriter0, stringBuffer0, 1, 1);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: 1
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }
}
