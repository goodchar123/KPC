/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:29:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_32749;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_32749_ESTest extends task_32749_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Locale locale0 = Locale.FRANCE;
      task_32749.setInputLocale(locale0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_32749 task_32749_0 = new task_32749();
  }
}
