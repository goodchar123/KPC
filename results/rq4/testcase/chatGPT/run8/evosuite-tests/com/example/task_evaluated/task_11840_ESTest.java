/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:10:45 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_11840;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_11840_ESTest extends task_11840_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      Enumeration<ByteArrayInputStream> enumeration0 = (Enumeration<ByteArrayInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      task_11840_0.skipBytes(sequenceInputStream0, 0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(sequenceInputStream0, 822);
      pushbackInputStream0.unread(822);
      task_11840_0.skipBytes(pushbackInputStream0, 822);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        task_11840_0.skipBytes(pipedInputStream0, 3408);
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      // Undeclared exception!
      try { 
        task_11840_0.skipBytes((InputStream) null, 2180);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11840", e);
      }
  }
}