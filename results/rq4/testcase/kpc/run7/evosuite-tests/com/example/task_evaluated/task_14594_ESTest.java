/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:50:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14594;
import java.io.FileDescriptor;
import java.io.InputStreamReader;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.nio.charset.Charset;
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
      try { 
        DatagramChannel.open();
      } catch(SocketException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix((Scanner) null, 1);
      } catch(IllegalArgumentException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
      String string0 = scanner0.findInLine("\"ycS;0");
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 0);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Scanner scanner0 = new Scanner("sO,Jg27rt;S}<B");
      boolean boolean0 = task_14594.hasNextBigIntegerInRadix(scanner0, (-2958));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, (-426));
      } catch(NoSuchElementException e) {
         //
         // No more tokens available
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Scanner scanner0 = new Scanner("sO,Jg27rt;S}<B");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 2117);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Scanner scanner0 = new Scanner("D/(UT)==Z`csY.");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      Scanner scanner0 = new Scanner(mockFileReader0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, (-240));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileReader", e);
      }
  }
}
