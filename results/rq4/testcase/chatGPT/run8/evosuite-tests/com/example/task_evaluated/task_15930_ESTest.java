/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 09:58:19 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15930;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15930_ESTest extends task_15930_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15930 task_15930_0 = new task_15930();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[4];
      stringArray0[0] = "9n/P#2.=6WGak,";
      stringArray0[1] = "9n/P#2.=6WGak,";
      stringArray0[2] = "com.example.task_evaluated.task_15930";
      stringArray0[3] = "9n/P#2.=6WGak,";
      task_15930.writeToFile("9n/P#2.=6WGak,", stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        task_15930.writeToFile((String) null, stringArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }
}
