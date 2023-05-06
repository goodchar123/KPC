/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 15:36:53 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14585;
import java.io.FileDescriptor;
import java.io.PipedInputStream;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.util.InputMismatchException;
import java.util.Scanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14585_ESTest extends task_14585_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14585 task_14585_0 = new task_14585();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      Scanner scanner0 = new Scanner(mockFileReader0);
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner0);
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
        task_14585.hasNextLong((Scanner) null);
      } catch(NullPointerException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_14585", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Scanner scanner0 = new Scanner(pipedInputStream0);
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner0);
      } catch(InputMismatchException e) {
         //
         // Next token does not match the Long regular expression, or is out of range for nextLong()
         //
         verifyException("com.example.task_evaluated.task_14585", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("2");
      boolean boolean0 = task_14585.hasNextLong(scanner0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Scanner scanner0 = new Scanner("=!:p");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DatagramChannel datagramChannel0 = DatagramChannel.open();
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        task_14585.hasNextLong(scanner0);
      } catch(NotYetConnectedException e) {
      }
  }
}
