/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 10:31:44 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_5809;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_5809_ESTest extends task_5809_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_5809 task_5809_0 = new task_5809();
      byte[] byteArray0 = new byte[3];
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, (byte)1, inetAddress0, (byte)0);
      // Undeclared exception!
      try { 
        task_5809_0.setPort(datagramPacket0, (-931));
      } catch(IllegalArgumentException e) {
         //
         // Port number out of range: -931
         //
         verifyException("com.example.task_evaluated.task_5809", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_5809 task_5809_0 = new task_5809();
      byte[] byteArray0 = new byte[3];
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, 0);
      // Undeclared exception!
      try { 
        task_5809_0.setPort(datagramPacket0, 65549);
      } catch(IllegalArgumentException e) {
         //
         // Port number out of range: 65549
         //
         verifyException("com.example.task_evaluated.task_5809", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_5809 task_5809_0 = new task_5809();
      // Undeclared exception!
      try { 
        task_5809_0.setPort((DatagramPacket) null, (byte)79);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_5809", e);
      }
  }
}
