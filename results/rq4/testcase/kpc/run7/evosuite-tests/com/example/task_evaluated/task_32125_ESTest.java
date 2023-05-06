/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:59:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_32125;
import java.io.DataInputStream;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_32125_ESTest extends task_32125_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_32125 task_32125_0 = new task_32125();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(mockFileInputStream0);
      DataInputStream dataInputStream0 = new DataInputStream(pushbackInputStream0);
      MemoryCacheImageInputStream memoryCacheImageInputStream0 = new MemoryCacheImageInputStream(dataInputStream0);
      try { 
        task_32125.decodeImage(memoryCacheImageInputStream0);
      } catch(IOException e) {
         //
         // No suitable ImageReader found
         //
         verifyException("com.example.task_evaluated.task_32125", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_32125.decodeImage((ImageInputStream) null);
      } catch(IllegalArgumentException e) {
         //
         // input == null!
         //
         verifyException("javax.imageio.ImageIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
      MemoryCacheImageInputStream memoryCacheImageInputStream0 = new MemoryCacheImageInputStream(dataInputStream0);
      // Undeclared exception!
      try { 
        task_32125.decodeImage(memoryCacheImageInputStream0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.DataInputStream", e);
      }
  }
}