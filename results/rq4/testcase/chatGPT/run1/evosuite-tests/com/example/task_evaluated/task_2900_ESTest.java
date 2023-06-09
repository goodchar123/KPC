/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:02:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2900;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2900_ESTest extends task_2900_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2900 task_2900_0 = new task_2900();
      // Undeclared exception!
      try { 
        task_2900_0.setLocale((Locale) null);
      } catch(NullPointerException e) {
         //
         // Can't set default locale to NULL
         //
         verifyException("java.util.Locale", e);
      }
  }
}
