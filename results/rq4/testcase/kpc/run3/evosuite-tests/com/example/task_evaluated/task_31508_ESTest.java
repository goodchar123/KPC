/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:22:55 GMT 2023
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
      // Undeclared exception!
      try { 
        task_31508.readBytes(sequenceInputStream0, (byte[]) null, 0, 0);
      } catch(NullPointerException e) {
         //
         // byte array is null
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        task_31508.readBytes(pipedInputStream0, byteArray0, (-323), (byte)14);
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      // Undeclared exception!
      try { 
        task_31508.readBytes(byteArrayInputStream0, byteArray0, (byte)0, (byte) (-74));
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1001, (byte)0);
      // Undeclared exception!
      try { 
        task_31508.readBytes(byteArrayInputStream0, byteArray0, 1001, (byte)0);
      } catch(IndexOutOfBoundsException e) {
         //
         // offset or length is invalid
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      task_31508.readBytes(byteArrayInputStream0, byteArray0, 1, 1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-41), (byte) (-41));
      try { 
        task_31508.readBytes(byteArrayInputStream0, byteArray0, 1, 1);
      } catch(IOException e) {
         //
         // end of file reached
         //
         verifyException("com.example.task_evaluated.task_31508", e);
      }
  }
}
