/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:32:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_4005;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_4005_ESTest extends task_4005_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_4005 task_4005_0 = new task_4005();
      // Undeclared exception!
      try { 
        task_4005_0.setLocaleForErrorReporting((Locale) null);
      } catch(NullPointerException e) {
         //
         // Can't set default locale to NULL
         //
         verifyException("java.util.Locale", e);
      }
  }
}
