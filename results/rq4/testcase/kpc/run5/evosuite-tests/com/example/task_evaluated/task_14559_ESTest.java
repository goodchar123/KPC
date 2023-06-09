/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:08:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14559;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14559_ESTest extends task_14559_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14559 task_14559_0 = new task_14559();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = task_14559.matchNextToken("4txR_hD,IUBlMcZmkw");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14559.matchNextToken((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14559.matchNextToken("r7.@emkZ:(T");
      } catch(PatternSyntaxException e) {
         //
         // Invalid regular expression pattern near index 11
         // r7.@emkZ:(T
         //
         verifyException("com.example.task_evaluated.task_14559", e);
      }
  }
}
