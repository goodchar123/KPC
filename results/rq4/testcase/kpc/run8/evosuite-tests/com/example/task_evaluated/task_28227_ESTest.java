/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:41:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_28227;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_28227_ESTest extends task_28227_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_28227 task_28227_0 = new task_28227();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Locale locale0 = Locale.PRC;
      boolean boolean0 = task_28227.selectInputMethod(locale0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_28227.selectInputMethod((Locale) null);
      } catch(NullPointerException e) {
         //
         // Locale cannot be null
         //
         verifyException("com.example.task_evaluated.task_28227", e);
      }
  }
}
