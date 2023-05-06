/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 10:11:48 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12775;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12775_ESTest extends task_12775_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12775 task_12775_0 = new task_12775();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1267);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0, 1267, 1267);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = task_12775.encodeRemaining(charBuffer1, charset0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(128);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      Charset charset0 = Charset.defaultCharset();
      ByteBuffer byteBuffer0 = task_12775.encodeRemaining(charBuffer0, charset0);
      // Undeclared exception!
      try { 
        task_12775.encodeRemaining(charBuffer1, charset0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[3];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        task_12775.encodeRemaining(charBuffer0, (Charset) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_12775", e);
      }
  }
}
