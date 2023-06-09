/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 11:06:20 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10290;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10290_ESTest extends task_10290_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10290 task_10290_0 = new task_10290();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 1748);
      byte[] byteArray0 = new byte[7];
      pushbackInputStream0.unread(byteArray0);
      int int0 = task_10290_0.readInt(pushbackInputStream0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_10290 task_10290_0 = new task_10290();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      try { 
        task_10290_0.readInt(sequenceInputStream0);
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10290", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_10290 task_10290_0 = new task_10290();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-92);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        task_10290_0.readInt(byteArrayInputStream0);
      } catch(IOException e) {
         //
         // Invalid int value: -1543503872
         //
         verifyException("com.example.task_evaluated.task_10290", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_10290 task_10290_0 = new task_10290();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-3191), 929);
      // Undeclared exception!
      try { 
        task_10290_0.readInt(byteArrayInputStream0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3191
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_10290 task_10290_0 = new task_10290();
      // Undeclared exception!
      try { 
        task_10290_0.readInt((InputStream) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_10290", e);
      }
  }
}
