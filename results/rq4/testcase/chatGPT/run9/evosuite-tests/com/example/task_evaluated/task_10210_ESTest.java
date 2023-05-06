/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:15:17 GMT 2023
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
      CharBuffer charBuffer0 = CharBuffer.allocate(594);
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence(stringWriter0, charBuffer0, (-2400), 594);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10210 task_10210_0 = new task_10210();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence((Writer) null, stringBuffer0, (-1), 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10210", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_10210 task_10210_0 = new task_10210();
      StringWriter stringWriter0 = new StringWriter();
      // Undeclared exception!
      try { 
        task_10210_0.appendSubsequence(stringWriter0, "J{<<O", 926, 926);
      } catch(StringIndexOutOfBoundsException e) {
      }
  }
}
