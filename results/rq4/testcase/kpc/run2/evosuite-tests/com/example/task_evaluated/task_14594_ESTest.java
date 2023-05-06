/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 22:51:38 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14594;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14594_ESTest extends task_14594_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14594 task_14594_0 = new task_14594();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      Scanner scanner0 = new Scanner(mockFileReader0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix((Scanner) null, 0);
      } catch(IllegalArgumentException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
      boolean boolean0 = scanner0.hasNext();
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 1);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("(aB");
      boolean boolean0 = task_14594.hasNextBigIntegerInRadix(scanner0, 1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1932, (byte)0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, (byte)25);
      Scanner scanner0 = new Scanner(pushbackInputStream0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, (byte)25);
      } catch(NoSuchElementException e) {
         //
         // No more tokens available
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-2814), 1267);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Scanner scanner0 = new Scanner(sequenceInputStream0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, (-1649));
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 12);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 113);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 0);
      } catch(NotYetConnectedException e) {
      }
  }
}