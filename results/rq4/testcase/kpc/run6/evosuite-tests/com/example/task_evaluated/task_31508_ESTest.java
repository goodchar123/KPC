/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:53:19 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31508;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31508_ESTest extends task_31508_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31508 task_31508_0 = new task_31508();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Enumeration<InputStream> enumeration0 = (Enumeration<InputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      byte[] byteArray0 = new byte[2];
      try { 
        task_31508.readBytes(sequenceInputStream0, byteArray0, (byte)0, 1);
      } catch(IOException e) {
         //
         // end of file reached
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_31508.readBytes((InputStream) null, (byte[]) null, (-1), (-1));
      } catch(NullPointerException e) {
         //
         // byte array is null
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(mockFileInputStream0);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        task_31508.readBytes(bufferedInputStream0, byteArray0, (-1), 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        task_31508.readBytes((InputStream) null, byteArray0, 23, (byte) (-1));
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 1834);
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        task_31508.readBytes(pipedInputStream0, byteArray0, 0, 1660);
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      task_31508.readBytes(byteArrayInputStream0, byteArray0, 0, (byte)6);
  }
}
