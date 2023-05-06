/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:27:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10210;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10210_ESTest extends task_10210_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10210 task_10210_0 = new task_10210();
      CharBuffer charBuffer0 = CharBuffer.allocate(2461);
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence((Writer) null, charBuffer0, 0, (-1));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10210", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10210 task_10210_0 = new task_10210();
      StringWriter stringWriter0 = new StringWriter(0);
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence(stringWriter0, charBuffer0, 0, (-1));
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_10210 task_10210_0 = new task_10210();
      StringWriter stringWriter0 = new StringWriter(0);
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence(stringWriter0, (CharSequence) null, 938, 938);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
