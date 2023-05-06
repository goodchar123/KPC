/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 21:41:06 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1361;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1361_ESTest extends task_1361_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1361 task_1361_0 = new task_1361();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_1361.removeFieldFromDescriptor("QElQ;", "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = task_1361.removeFieldFromDescriptor("", "yt-6=qY");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1361.removeFieldFromDescriptor("rl@s<$aHS<gOR\"`&F", (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }
}
