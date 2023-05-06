/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:29:16 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9931;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9931_ESTest extends task_9931_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9931 task_9931_0 = new task_9931();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(521);
      try { 
        task_9931_0.appendSubsequence(stringWriter0, charBuffer0, (-1785), 521);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9931", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9931 task_9931_0 = new task_9931();
      StringWriter stringWriter0 = new StringWriter(1);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) stringBuffer0);
      try { 
        task_9931_0.appendSubsequence(stringWriter0, charBuffer0, 1, (-1062));
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9931", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_9931 task_9931_0 = new task_9931();
      StringWriter stringWriter0 = new StringWriter();
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      try { 
        task_9931_0.appendSubsequence(stringWriter0, charBuffer0, 675, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9931", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_9931 task_9931_0 = new task_9931();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      try { 
        task_9931_0.appendSubsequence(stringWriter0, stringBuffer0, 497, 497);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9931", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_9931 task_9931_0 = new task_9931();
      StringWriter stringWriter0 = new StringWriter(0);
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        task_9931_0.appendSubsequence((Writer) null, stringBuffer0, 0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9931", e);
      }
  }
}
