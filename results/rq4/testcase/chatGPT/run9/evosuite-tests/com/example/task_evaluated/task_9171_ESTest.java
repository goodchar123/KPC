/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:01:28 GMT 2023
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
      int int0 = task_9171.getLastMatchOffset("|", "|");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9171.getLastMatchOffset((String) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9171.getLastMatchOffset("H#aPQuqQ{'&", "H#aPQuqQ{'&");
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition near index 7
         // H#aPQuqQ{'&
         //        ^
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
