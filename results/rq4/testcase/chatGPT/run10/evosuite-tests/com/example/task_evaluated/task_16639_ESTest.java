/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:46:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_16639;
import javax.net.ssl.SSLEngine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16639_ESTest extends task_16639_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16639 task_16639_0 = new task_16639();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        task_16639_0.setEnabledProtocols((SSLEngine) null, stringArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_16639", e);
      }
  }
}
