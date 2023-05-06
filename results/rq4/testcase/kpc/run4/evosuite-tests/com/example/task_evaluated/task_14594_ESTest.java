/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 10:21:01 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14594;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14594_ESTest extends task_14594_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14594 task_14594_0 = new task_14594();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 1);
      } catch(NotYetConnectedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix((Scanner) null, (-177));
      } catch(IllegalArgumentException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
      boolean boolean0 = scanner0.hasNext("");
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, (-3668));
      } catch(IllegalStateException e) {
         //
         // Scanner is closed
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("9L%Gl?4EX(_@HzZ");
      boolean boolean0 = task_14594.hasNextBigIntegerInRadix(scanner0, 1755);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Scanner scanner0 = new Scanner("");
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 0);
      } catch(NoSuchElementException e) {
         //
         // No more tokens available
         //
         verifyException("com.example.task_evaluated.task_14594", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Scanner scanner0 = new Scanner("Scanner is closed");
      Scanner scanner1 = scanner0.useDelimiter((Pattern) null);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, 29);
      } catch(IllegalArgumentException e) {
         //
         // Pattern cannot be null
         //
         verifyException("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Scanner scanner0 = new Scanner(path0);
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
  public void test8()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      Scanner scanner0 = new Scanner(dataInputStream0);
      // Undeclared exception!
      try { 
        task_14594.hasNextBigIntegerInRadix(scanner0, (-1263));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
}