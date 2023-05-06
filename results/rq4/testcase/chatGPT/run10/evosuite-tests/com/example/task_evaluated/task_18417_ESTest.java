/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:43:31 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18417;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18417_ESTest extends task_18417_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18417 task_18417_0 = new task_18417();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Map<String, String> map0 = task_18417.parseBorderSpacing("8Sh!S< 2Z-");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Map<String, String> map0 = task_18417.parseBorderSpacing("4(");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Map<String, String> map0 = task_18417.parseBorderSpacing("&qiX8^q & i.]>?");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18417.parseBorderSpacing((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_18417", e);
      }
  }
}
