/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 15:57:27 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14565;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14565_ESTest extends task_14565_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14565 task_14565_0 = new task_14565();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      task_14565.main(stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14565.findNextOccurrence("Rh", "\"");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_14565.findNextOccurrence("\"", "\"");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14565.findNextOccurrence("Rh", (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14565.findNextOccurrence("\"`,#(JQpT", "BwE0D}Wj-CN$(3W2+");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 17
         // BwE0D}Wj-CN$(3W2+
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
