/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:56:59 GMT 2023
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
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence(stringWriter0, stringBuffer0, 0, (-911));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -911
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10210 task_10210_0 = new task_10210();
      StringWriter stringWriter0 = new StringWriter();
      CharBuffer charBuffer0 = CharBuffer.allocate(0);
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence(stringWriter0, charBuffer0, 1789, 1789);
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
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence((Writer) null, (CharSequence) null, (-1), 1668);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10210", e);
      }
  }
}
