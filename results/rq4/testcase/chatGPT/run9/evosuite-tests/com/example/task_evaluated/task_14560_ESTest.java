/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:39:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14560;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.NotYetConnectedException;
import java.nio.channels.SocketChannel;
import java.util.Scanner;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14560_ESTest extends task_14560_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("com.example.task_evaluated.task_14560");
      String string0 = task_14560_0.getNextToken("", scanner0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      Scanner scanner0 = new Scanner("com.example.task_evaluated.task_14560");
      String string0 = task_14560_0.getNextToken("com.example.task_evaluated.task_14560", scanner0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      try { 
        DatagramChannel.open();
      } catch(SocketException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("<", (Scanner) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14560", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14560 task_14560_0 = new task_14560();
      SocketChannel socketChannel0 = SocketChannel.open();
      Scanner scanner0 = new Scanner(socketChannel0);
      // Undeclared exception!
      try { 
        task_14560_0.getNextToken("", scanner0);
      } catch(NotYetConnectedException e) {
      }
  }
}
