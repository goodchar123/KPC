/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 21:47:56 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_16639;
import javax.net.ssl.SSLEngine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16639_ESTest extends task_16639_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16639 task_16639_0 = new task_16639();
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      doReturn((String[]) null).when(sSLEngine0).getSupportedProtocols();
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        task_16639_0.setEnabledProtocols(sSLEngine0, stringArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_16639 task_16639_0 = new task_16639();
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        task_16639_0.setEnabledProtocols(sSLEngine0, (String[]) null);
      } catch(IllegalArgumentException e) {
         //
         // Protocols parameter cannot be null
         //
         verifyException("com.example.task_evaluated.task_16639", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_16639 task_16639_0 = new task_16639();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "3Ie,!&w`Zsq*L";
      stringArray0[1] = "(%aw907LKIC3,K";
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(sSLEngine0).getSupportedProtocols();
      String[] stringArray1 = new String[1];
      // Undeclared exception!
      try { 
        task_16639_0.setEnabledProtocols(sSLEngine0, stringArray1);
      } catch(IllegalArgumentException e) {
         //
         // Protocol null is not supported
         //
         verifyException("com.example.task_evaluated.task_16639", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_16639 task_16639_0 = new task_16639();
      String[] stringArray0 = new String[1];
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      doReturn(stringArray0).when(sSLEngine0).getSupportedProtocols();
      task_16639_0.setEnabledProtocols(sSLEngine0, stringArray0);
  }
}
