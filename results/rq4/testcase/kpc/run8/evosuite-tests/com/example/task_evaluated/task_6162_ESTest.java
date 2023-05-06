/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:45:23 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_6162;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
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

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_6162 task_6162_0 = new task_6162();
      MockDatagramSocket mockDatagramSocket0 = new MockDatagramSocket((SocketAddress) null);
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      try { 
        task_6162_0.bindDatagramSocket(mockDatagramSocket0, inetAddress0, (-1));
      } catch(IllegalArgumentException e) {
         //
         // Invalid address or port: port out of range:-1
         //
         verifyException("com.example.task_evaluated.task_6162", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_6162 task_6162_0 = new task_6162();
      InetAddress inetAddress0 = MockInetAddress.getByName("");
      MockDatagramSocket mockDatagramSocket0 = new MockDatagramSocket(0, inetAddress0);
      try { 
        task_6162_0.bindDatagramSocket(mockDatagramSocket0, inetAddress0, 0);
      } catch(SocketException e) {
         //
         // Error binding socket to address /127.0.0.1 and port 0: already bound
         //
         verifyException("com.example.task_evaluated.task_6162", e);
      }
  }
}
