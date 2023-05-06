/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:46:36 GMT 2023
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
      String string0 = task_14565.findNextOccurrence("com.example.task_evaluated.task_14565", (String) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14565.findNextOccurrence("com.example.task_evaluated.task_14565", "com.example.task_evaluated.task_14565");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14565.findNextOccurrence((String) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14565", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14565.findNextOccurrence("e}wD7[je)", "e}wD7[je)");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 12
         // (?i)e}wD7[je)
         //             ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
