/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:19:20 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31508;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
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
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        task_31508.readBytes(sequenceInputStream0, byteArray0, 1, (-1));
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      // Undeclared exception!
      try { 
        task_31508.readBytes(sequenceInputStream0, (byte[]) null, 2088, (-1045));
      } catch(NullPointerException e) {
         //
         // byte array is null
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        task_31508.readBytes(byteArrayInputStream0, byteArray0, (byte) (-78), (byte) (-78));
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        task_31508.readBytes((InputStream) null, byteArray0, (byte)0, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        task_31508.readBytes(pipedInputStream0, byteArray0, (byte)0, 1308);
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
      task_31508.readBytes(byteArrayInputStream0, byteArray0, (byte)1, (byte)1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      int int0 = byteArrayInputStream0.read(byteArray0);
      try { 
        task_31508.readBytes(byteArrayInputStream0, byteArray0, (byte)1, (byte)1);
      } catch(IOException e) {
         //
         // end of file reached
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }
}
