/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:09:26 GMT 2023
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
      byte[] byteArray0 = new byte[9];
      InetAddress inetAddress0 = MockInetAddress.getLocalHost();
      DatagramPacket datagramPacket0 = new DatagramPacket(byteArray0, (byte)0, inetAddress0, (byte)121);
      // Undeclared exception!
      try { 
        task_5809_0.setPort(datagramPacket0, (byte) (-1));
      } catch(IllegalArgumentException e) {
         //
         // Port out of range:-1
         //
         verifyException("java.net.DatagramPacket", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_5809 task_5809_0 = new task_5809();
      // Undeclared exception!
      try { 
        task_5809_0.setPort((DatagramPacket) null, (-1961));
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_5809", e);
      }
  }
}
