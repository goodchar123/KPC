/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:00:46 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10024;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10024_ESTest extends task_10024_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10024 task_10024_0 = new task_10024();
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)1, (byte) (-63));
      int int0 = task_10024_0.availableWithoutBlocking(byteArrayInputStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10024 task_10024_0 = new task_10024();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        task_10024_0.availableWithoutBlocking(sequenceInputStream0);
      } catch(IOException e) {
         //
         // mark/reset not supported
         //
         verifyException("java.io.InputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_10024 task_10024_0 = new task_10024();
      // Undeclared exception!
      try { 
        task_10024_0.availableWithoutBlocking((InputStream) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10024", e);
      }
  }
}
