/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:19:49 GMT 2023
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
      task_7721 task_7721_0 = new task_7721();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7721.insertString((CharSequence) null, (String) null, (-1));
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: -1
         //
         verifyException("com.example.task_evaluated.task_7721", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[9];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0, 0, 0);
      CharSequence charSequence0 = task_7721.insertString(charBuffer0, "qVMnl_#wr", 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7721.insertString("D<t;@.~F2+2=@$Qk", "D<t;@.~F2+2=@$Qk", 1239);
      } catch(StringIndexOutOfBoundsException e) {
         //
         // Invalid offset: 1239
         //
         verifyException("com.example.task_evaluated.task_7721", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_7721.insertString((CharSequence) null, (String) null, 450);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_7721", e);
      }
  }
}
