/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 02:58:32 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14135;
import java.util.StringTokenizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14135_ESTest extends task_14135_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14135 task_14135_0 = new task_14135();
      StringTokenizer stringTokenizer0 = new StringTokenizer("Q~3JobZd7");
      String string0 = task_14135_0.getNextToken(stringTokenizer0);
      String string1 = task_14135_0.getNextToken(stringTokenizer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14135 task_14135_0 = new task_14135();
      StringTokenizer stringTokenizer0 = new StringTokenizer("com.example.task_evaluated.task_14135", (String) null, false);
      // Undeclared exception!
      try { 
        task_14135_0.getNextToken(stringTokenizer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.StringTokenizer", e);
      }
  }
}
