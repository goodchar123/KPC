/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 20:25:37 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12827;
import java.io.PipedInputStream;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.util.NoSuchElementException;
import java.util.Scanner;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12827_ESTest extends task_12827_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12827 task_12827_0 = new task_12827();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream(169);
      Scanner scanner0 = new Scanner(pipedInputStream0);
      // Undeclared exception!
      try { 
        task_12827.getErroneousInputLength(scanner0);
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Scanner", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_12827.getErroneousInputLength((Scanner) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_12827", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        task_12827.getErroneousInputLength(scanner0);
      } catch(NotYetConnectedException e) {
      }
  }
}
