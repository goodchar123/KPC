/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:23:29 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9171;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9171_ESTest extends task_9171_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9171 task_9171_0 = new task_9171();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = task_9171.getLastMatchOffset("a>rQwpJg", "a>rQwpJg");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9171.getLastMatchOffset("", (String) null);
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
        task_9171.getLastMatchOffset("pVZINn(z3:,.", "");
      } catch(PatternSyntaxException e) {
         //
         // Unclosed group near index 14
         // pVZINn(z3:,.
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
