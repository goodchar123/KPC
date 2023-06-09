/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:35:42 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_16636;
import javax.net.ssl.SSLEngine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16636_ESTest extends task_16636_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16636 task_16636_0 = new task_16636();
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        task_16636_0.setEnabledCipherSuites(sSLEngine0, (String[]) null);
      } catch(IllegalArgumentException e) {
         //
         // Cipher suites parameter cannot be null
         //
         verifyException("com.example.task_evaluated.task_16636", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_16636 task_16636_0 = new task_16636();
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(sSLEngine0).getSupportedCipherSuites();
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        task_16636_0.setEnabledCipherSuites(sSLEngine0, stringArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_16636 task_16636_0 = new task_16636();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "x=aT";
      stringArray0[1] = ",b#UkI";
      stringArray0[2] = "O01A9Jbz#CXOk";
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(sSLEngine0).getSupportedCipherSuites();
      String[] stringArray1 = new String[4];
      // Undeclared exception!
      try { 
        task_16636_0.setEnabledCipherSuites(sSLEngine0, stringArray1);
      } catch(IllegalArgumentException e) {
         //
         // Cipher suite null is not supported
         //
         verifyException("com.example.task_evaluated.task_16636", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_16636 task_16636_0 = new task_16636();
      String[] stringArray0 = new String[9];
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(sSLEngine0).getSupportedCipherSuites();
      task_16636_0.setEnabledCipherSuites(sSLEngine0, stringArray0);
  }
}
