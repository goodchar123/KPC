/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:38:17 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_3624;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_3624_ESTest extends task_3624_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_3624 task_3624_0 = new task_3624();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_3624.closeTags("<V4/>");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_3624.closeTags("<p+7i><o+>");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_3624.closeTags((String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
