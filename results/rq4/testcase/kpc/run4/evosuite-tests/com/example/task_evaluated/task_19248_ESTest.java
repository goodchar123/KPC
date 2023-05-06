/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:13:20 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_19248;
import java.io.IOException;
import java.nio.channels.SocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_19248_ESTest extends task_19248_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_19248 task_19248_0 = new task_19248();
      SocketChannel socketChannel0 = SocketChannel.open();
      try { 
        task_19248_0.shutdownConnection(socketChannel0);
      } catch(IOException e) {
         //
         // Error shutting down output stream
         //
         verifyException("com.example.task_evaluated.task_19248", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_19248 task_19248_0 = new task_19248();
      // Undeclared exception!
      try { 
        task_19248_0.shutdownConnection((SocketChannel) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_19248", e);
      }
  }
}
