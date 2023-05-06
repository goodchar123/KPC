/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:36:33 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12827;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.net.ProtocolFamily;
import java.net.StandardProtocolFamily;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12827_ESTest extends task_12827_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12827 task_12827_0 = new task_12827();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileReader mockFileReader0 = new MockFileReader(fileDescriptor0);
      BufferedReader bufferedReader0 = new BufferedReader(mockFileReader0);
      Scanner scanner0 = new Scanner(bufferedReader0);
      // Undeclared exception!
      try { 
        task_12827.getErroneousInputLength(scanner0);
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
        task_12827.getErroneousInputLength((Scanner) null);
      } catch(IllegalArgumentException e) {
         //
         // Scanner cannot be null
         //
         verifyException("com.example.task_evaluated.task_12827", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Scanner scanner0 = new Scanner("com.example.task_evaluated.task_12827");
      int int0 = task_12827.getErroneousInputLength(scanner0);
      // Undeclared exception!
      try { 
        task_12827.getErroneousInputLength(scanner0);
      } catch(NoSuchElementException e) {
         //
         // No more tokens available
         //
         verifyException("com.example.task_evaluated.task_12827", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Scanner scanner0 = new Scanner("ey>.tc9|2 ");
      scanner0.close();
      // Undeclared exception!
      try { 
        task_12827.getErroneousInputLength(scanner0);
      } catch(IllegalStateException e) {
         //
         // Scanner closed
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StandardProtocolFamily standardProtocolFamily0 = StandardProtocolFamily.INET6;
      DatagramChannel datagramChannel0 = DatagramChannel.open((ProtocolFamily) standardProtocolFamily0);
      Scanner scanner0 = new Scanner(datagramChannel0);
      // Undeclared exception!
      try { 
        task_12827.getErroneousInputLength(scanner0);
      } catch(NotYetConnectedException e) {
      }
  }
}