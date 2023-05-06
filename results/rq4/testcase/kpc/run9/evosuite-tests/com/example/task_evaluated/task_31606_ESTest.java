/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:51:29 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_31606;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_31606_ESTest extends task_31606_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_31606 task_31606_0 = new task_31606();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, 255);
      DataInputStream dataInputStream0 = new DataInputStream(bufferedInputStream0);
      short short0 = task_31606.readShort(dataInputStream0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 3007, 0);
      DataInputStream dataInputStream0 = new DataInputStream(byteArrayInputStream0);
      try { 
        task_31606.readShort(dataInputStream0);
      } catch(EOFException e) {
         //
         // End of stream reached before all bytes could be read
         //
         verifyException("com.example.task_evaluated.task_31606", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) null, 555);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 555);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(bufferedInputStream0, pipedInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(sequenceInputStream0);
      try { 
        task_31606.readShort(dataInputStream0);
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2871), (byte)94);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      // Undeclared exception!
      try { 
        task_31606.readShort(dataInputStream0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      // Undeclared exception!
      try { 
        task_31606.readShort(dataInputStream0);
      } catch(NullPointerException e) {
         //
         // Input stream is null
         //
         verifyException("com.example.task_evaluated.task_31606", e);
      }
  }
}
