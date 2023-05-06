/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:01:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10600;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10600_ESTest extends task_10600_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10600 task_10600_0 = new task_10600();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RoundingMode roundingMode0 = RoundingMode.UNNECESSARY;
      // Undeclared exception!
      try { 
        task_10600.setRoundingMode((DecimalFormat) null, roundingMode0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10600", e);
      }
  }
}
