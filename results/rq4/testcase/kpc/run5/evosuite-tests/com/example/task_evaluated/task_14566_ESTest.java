/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:59:40 GMT 2023
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
      String string0 = task_14566.findNextOccurrence("v<9#%&", "-@@", "-@@");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_14566.findNextOccurrence("", "", "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14566.findNextOccurrence(" ruoYnZ.eH0+c|", "=:\"5jAbyQ", "=:\"5jAbyQ");
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14566.findNextOccurrence((String) null, "CoH..&ZGiE$es5=V#*", "c");
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
        task_14566.findNextOccurrence("C:KW)/(\t+p)7|;2m", "", "C:KW)/(\t+p)7|;2m");
      } catch(PatternSyntaxException e) {
         //
         // Unmatched closing ')' near index 3
         // C:KW)/(\t+p)7|;2m
         //    ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}