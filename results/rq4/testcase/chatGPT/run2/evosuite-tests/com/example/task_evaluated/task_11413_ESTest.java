/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:01:28 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_11413;
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
        task_11413_0.appendSubsequence(stringBuffer0, stringBuffer0, (-1679), (-1679));
      } catch(IndexOutOfBoundsException e) {
         //
         // start -1679, end -1679, s.length() 0
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_11413 task_11413_0 = new task_11413();
      StringBuffer stringBuffer0 = new StringBuffer();
      // Undeclared exception!
      try { 
        task_11413_0.appendSubsequence((StringBuffer) null, stringBuffer0, 292, 292);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11413", e);
      }
  }
}
