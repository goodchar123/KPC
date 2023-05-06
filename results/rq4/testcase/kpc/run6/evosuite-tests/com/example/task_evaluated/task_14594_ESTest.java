/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:31:08 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14594;
import java.io.ByteArrayInputStream;
import java.io.PipedReader;
import java.nio.CharBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14594_ESTest extends task_14594_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14594 task_14594_0 = new task_14594();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 2076);
      } catch(NoSuchElementException e) {
         //
         // No more tokens available
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix((Scanner) null, 2208);
      } catch(IllegalArgumentException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader(1);
      Scanner scanner0 = new Scanner(pipedReader0);
      String string0 = scanner0.findInLine("");
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 384);
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("X");
      boolean boolean0 = task_14594.hasNextBigIntegerInRadix(scanner0, (-18));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-11), 1388);
      Scanner scanner0 = new Scanner(byteArrayInputStream0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 0);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Scanner scanner0 = new Scanner("8[{x\"HcowXg");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, (-1));
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      char[] charArray0 = new char[7];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      char char0 = charBuffer0.get();
      Scanner scanner0 = new Scanner(charBuffer1);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.Buffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 2954);
      } catch(NotYetConnectedException e) {
      }
  }
}