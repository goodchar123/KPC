/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:06:44 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_33440;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_33440_ESTest extends task_33440_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_33440 task_33440_0 = new task_33440();
      // Undeclared exception!
      try { 
        task_33440_0.supportsTargetEncoding("", "");
      } catch(NullPointerException e) {
      }
  }
}
