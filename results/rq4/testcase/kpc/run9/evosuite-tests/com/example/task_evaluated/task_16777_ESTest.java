/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:19:31 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_16777;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_16777_ESTest extends task_16777_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_16777 task_16777_0 = new task_16777();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        task_16777.setApplicationProtocolPriorities(sSLEngine0, stringArray0);
      } catch(IllegalArgumentException e) {
         //
         // Protocol name cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_16777", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_16777.setApplicationProtocolPriorities((SSLEngine) null, (String[]) null);
      } catch(IllegalArgumentException e) {
         //
         // Protocol array cannot be null
         //
         verifyException("com.example.task_evaluated.task_16777", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      // Undeclared exception!
      try { 
        task_16777.setApplicationProtocolPriorities(sSLEngine0, stringArray0);
      } catch(IllegalArgumentException e) {
         //
         // Protocol name cannot be null or empty
         //
         verifyException("com.example.task_evaluated.task_16777", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SSLEngine sSLEngine0 = mock(SSLEngine.class, new ViolatedAssumptionAnswer());
      doReturn((SSLParameters) null).when(sSLEngine0).getSSLParameters();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "d.@S'5Ej|?^m3";
      // Undeclared exception!
      try { 
        task_16777.setApplicationProtocolPriorities(sSLEngine0, stringArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_16777", e);
      }
  }
}
