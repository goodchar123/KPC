/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:28:03 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6162;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockDatagramSocket;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_6162_ESTest extends task_6162_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_6162 task_6162_0 = new task_6162();
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      MockDatagramSocket mockDatagramSocket0 = new MockDatagramSocket(0, inetAddress0);
      try { 
        task_6162_0.bindDatagramSocket(mockDatagramSocket0, inetAddress0, 3735);
      } catch(SocketException e) {
         //
         // already bound
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockDatagramSocket", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6162 task_6162_0 = new task_6162();
      MockDatagramSocket mockDatagramSocket0 = new MockDatagramSocket();
      InetAddress inetAddress0 = MockInetAddress.anyLocalAddress();
      // Undeclared exception!
      try { 
        task_6162_0.bindDatagramSocket(mockDatagramSocket0, inetAddress0, (-2155));
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-2155
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_6162 task_6162_0 = new task_6162();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      // Undeclared exception!
      try { 
        task_6162_0.bindDatagramSocket((DatagramSocket) null, inetAddress0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_6162", e);
      }
  }
}
