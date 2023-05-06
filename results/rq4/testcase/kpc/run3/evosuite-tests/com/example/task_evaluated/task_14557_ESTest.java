/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:36:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14557;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.PipedReader;
import java.io.PushbackInputStream;
import java.io.PushbackReader;
import java.io.SequenceInputStream;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14557_ESTest extends task_14557_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      try { 
        DatagramChannel.open();
      } catch(SocketException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken((Scanner) null);
      } catch(IllegalArgumentException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      PipedReader pipedReader0 = new PipedReader(2716);
      Scanner scanner0 = new Scanner(pipedReader0);
      boolean boolean0 = scanner0.hasNext();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      Scanner scanner0 = new Scanner("+");
      String string0 = task_14557_0.getNextToken(scanner0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(NoSuchElementException e) {
         //
         // No more tokens available
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(byteArrayInputStream0, 1);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pushbackInputStream0, pushbackInputStream0);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(sequenceInputStream0, (byte)1);
      Scanner scanner0 = new Scanner(bufferedInputStream0);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      Scanner scanner0 = new Scanner("");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner1);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      PipedReader pipedReader0 = new PipedReader();
      Scanner scanner0 = new Scanner(pipedReader0);
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      PushbackReader pushbackReader0 = new PushbackReader(mockFileReader0);
      Scanner scanner0 = new Scanner(pushbackReader0);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileReader", e);
      }
  }
}