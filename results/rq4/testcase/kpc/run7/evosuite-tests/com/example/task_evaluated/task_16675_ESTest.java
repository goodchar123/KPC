/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:51:39 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_16675;
import javax.net.ssl.SSLSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16675_ESTest extends task_16675_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16675 task_16675_0 = new task_16675();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SSLSocketFactory sSLSocketFactory0 = mock(SSLSocketFactory.class, new ViolatedAssumptionAnswer());
      task_16675.setDefaultSSLSocketFactory(sSLSocketFactory0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_16675.setDefaultSSLSocketFactory((SSLSocketFactory) null);
      } catch(IllegalArgumentException e) {
         //
         // SSLSocketFactory parameter cannot be null
         //
         verifyException("com.example.task_evaluated.task_16675", e);
      }
  }
}
