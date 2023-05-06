/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:07:29 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14188;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14188_ESTest extends task_14188_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14188 task_14188_0 = new task_14188();
      Locale locale0 = Locale.JAPANESE;
      task_14188_0.setLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14188 task_14188_0 = new task_14188();
      try { 
        task_14188_0.setLocale((Locale) null);
      } catch(NullPointerException e) {
         //
         // newLocale cannot be null
         //
         verifyException("com.example.task_evaluated.task_14188", e);
      }
  }
}
