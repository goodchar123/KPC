/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 18:57:52 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14585;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14585_ESTest extends task_14585_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14585 task_14585_0 = new task_14585();
      PipedInputStream pipedInputStream0 = new PipedInputStream(112);
      Scanner scanner0 = new Scanner(pipedInputStream0);
      boolean boolean0 = task_14585.hasNextLong(scanner0);
      try { 
        DatagramChannel.open();
      } catch(SocketException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scanner scanner0 = new Scanner("8=h 1SbYY)p");
      boolean boolean0 = task_14585.hasNextLong(scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[9];
      charArray0[0] = '0';
      CharArrayReader charArrayReader0 = new CharArrayReader(charArray0, 0, 1);
      Scanner scanner0 = new Scanner(charArrayReader0);
      boolean boolean0 = task_14585.hasNextLong(scanner0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-1), 3074);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner1);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14585.hasNextLong((Scanner) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14585", e);
      }
  }
}
