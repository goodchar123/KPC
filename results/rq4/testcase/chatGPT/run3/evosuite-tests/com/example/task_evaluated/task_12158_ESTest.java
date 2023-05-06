/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:49:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12158;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.security.MessageDigest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12158_ESTest extends task_12158_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_12158 task_12158_0 = new task_12158();
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      try { 
        task_12158_0.updateDigestAndWriteToOutputStream((byte)113, (MessageDigest) null, pipedOutputStream0);
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_12158 task_12158_0 = new task_12158();
      // Undeclared exception!
      try { 
        task_12158_0.updateDigestAndWriteToOutputStream((byte)34, (MessageDigest) null, (OutputStream) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_12158", e);
      }
  }
}
