/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:28:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_12158;
import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileOutputStream;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_12158_ESTest extends task_12158_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      task_12158 task_12158_0 = new task_12158();
      MockFile mockFile0 = new MockFile("", "PfcDj$vFc*]tL%S");
      MockFileOutputStream mockFileOutputStream0 = new MockFileOutputStream(mockFile0);
      try { 
        task_12158_0.updateDigestAndWriteToOutputStream((byte)115, (MessageDigest) null, mockFileOutputStream0);
      } catch(IOException e) {
         //
         // Simulated IOException
         //
         verifyException("org.evosuite.runtime.vfs.VirtualFileSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_12158 task_12158_0 = new task_12158();
      // Undeclared exception!
      try { 
        task_12158_0.updateDigestAndWriteToOutputStream((byte)0, (MessageDigest) null, (OutputStream) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_12158", e);
      }
  }
}
