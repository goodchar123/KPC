/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:00:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14568;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14568_ESTest extends task_14568_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14568 task_14568_0 = new task_14568();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14568.findNextOccurrence("sLSK}2+8ge&\"-Yu", "sLSK}2+8ge&\"-Yu");
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         verifyException("com.example.task_evaluated.task_14568", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14568.findNextOccurrence("", "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14568.findNextOccurrence("", (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14568.findNextOccurrence("Previous match operation failed", "ER|~LGUG{v");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 7
         // ER|~LGUG{v
         //        ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
