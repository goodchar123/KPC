/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:03:46 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.task_evaluated.task_19238;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_19238_ESTest extends task_19238_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_19238 task_19238_0 = new task_19238();
      SocketChannel socketChannel0 = SocketChannel.open();
      SocketAddress socketAddress0 = task_19238_0.getSocketAssociation(socketChannel0);
  }
}