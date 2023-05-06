/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:09:49 GMT 2023
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
      Locale locale0 = Locale.ITALIAN;
      task_4005_0.setLocaleForErrorReporting(locale0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_4005 task_4005_0 = new task_4005();
      try { 
        task_4005_0.setLocaleForErrorReporting((Locale) null);
      } catch(NullPointerException e) {
         //
         // newLocale cannot be null
         //
         verifyException("com.example.task_evaluated.task_4005", e);
      }
  }
}
