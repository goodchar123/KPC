/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:22:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9173;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9173_ESTest extends task_9173_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9173 task_9173_0 = new task_9173();
      Pattern pattern0 = Pattern.compile("");
      Matcher matcher0 = pattern0.matcher("");
      // Undeclared exception!
      try { 
        task_9173_0.end("", matcher0);
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9173 task_9173_0 = new task_9173();
      Pattern pattern0 = Pattern.compile("");
      Matcher matcher0 = pattern0.matcher("");
      boolean boolean0 = matcher0.find();
      // Undeclared exception!
      try { 
        task_9173_0.end("", matcher0);
      } catch(IllegalArgumentException e) {
         //
         // No group with name <>
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_9173 task_9173_0 = new task_9173();
      // Undeclared exception!
      try { 
        task_9173_0.end("", (Matcher) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9173", e);
      }
  }
}