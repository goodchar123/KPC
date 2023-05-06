/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 04:57:08 GMT 2023
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
      task_14565.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14565.findNextOccurrence("", "r");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String string0 = task_14565.findNextOccurrence("}xt=gq\"*%", "");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14565.findNextOccurrence((String) null, (String) null);
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
        task_14565.findNextOccurrence("k\"#y?", "fox(");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 4
         // fox(
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
