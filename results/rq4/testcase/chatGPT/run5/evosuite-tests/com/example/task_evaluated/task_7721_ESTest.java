/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:24:15 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_7721;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_7721_ESTest extends task_7721_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        task_7721.insertString(charBuffer0, "0cyY8Aiox:q0pk", (-1191));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1191
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_7721 task_7721_0 = new task_7721();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(1097);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      CharBuffer charBuffer2 = charBuffer0.compact();
      // Undeclared exception!
      try { 
        task_7721.insertString(charBuffer1, "", 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7721.insertString((CharSequence) null, "", 2381);
      } catch(NullPointerException e) {
      }
  }
}
