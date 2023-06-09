/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 17:54:22 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14566;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14566_ESTest extends task_14566_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14566 task_14566_0 = new task_14566();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_14566.findNextOccurrence("", "2}R", "x^qf*bZ9:xa");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14566.findNextOccurrence("", "", "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14566.findNextOccurrence("vUdo]wf98\"N.|`", "vUdo]wf98\"N.|`", "CmPcU%2ESJcR");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14566.findNextOccurrence((String) null, "", "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14566", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      try { 
        task_14566.findNextOccurrence("com.example.task_evaluated.task_14566", "", "#PMSZX!Sf /~0Tv[");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed character class near index 15
         // #PMSZX!Sf /~0Tv[
         //                ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
