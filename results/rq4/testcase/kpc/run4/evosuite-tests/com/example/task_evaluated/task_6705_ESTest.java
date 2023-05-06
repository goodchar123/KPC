/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:34:40 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6705;
import java.time.Duration;
import java.time.LocalDateTime;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6705_ESTest extends task_6705_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6705 task_6705_0 = new task_6705();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Duration duration0 = Duration.ZERO;
      // Undeclared exception!
      try { 
        task_6705.subtractFromDateTime((LocalDateTime) null, duration0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6705", e);
      }
  }
}
