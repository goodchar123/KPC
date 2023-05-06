/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:28:54 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14557;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14557_ESTest extends task_14557_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
      String string0 = task_14557_0.getNextToken(scanner0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scanner scanner0 = new Scanner("k ");
      task_14557 task_14557_0 = new task_14557();
      String string0 = task_14557_0.getNextToken(scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-36), 1523);
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0);
      Scanner scanner0 = new Scanner(bufferedInputStream0);
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken(scanner0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
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
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("89 <");
      scanner0.close();
      task_14557 task_14557_0 = new task_14557();
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
  public void test5()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      // Undeclared exception!
      try { 
        task_14557_0.getNextToken((Scanner) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14557", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_14557 task_14557_0 = new task_14557();
      try { 
        DatagramChannel.open();
      } catch(SocketException e) {
      }
  }
}
