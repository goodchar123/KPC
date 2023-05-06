/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:25:57 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_11840;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_11840_ESTest extends task_11840_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      task_11840_0.skipBytes((InputStream) null, (-1));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      // Undeclared exception!
      try { 
        task_11840_0.skipBytes((InputStream) null, 2034);
      } catch(IndexOutOfBoundsException e) {
         //
         // invalid offset or length
         //
         verifyException("com.example.task_evaluated.task_11840", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      byte[] byteArray0 = new byte[3];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-26), 1056);
      // Undeclared exception!
      try { 
        task_11840_0.skipBytes(byteArrayInputStream0, 289);
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      byte[] byteArray0 = new byte[2];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        task_11840_0.skipBytes(byteArrayInputStream0, (byte)114);
      } catch(IOException e) {
         //
         // could not read from input stream
         //
         verifyException("com.example.task_evaluated.task_11840", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_11840 task_11840_0 = new task_11840();
      // Undeclared exception!
      try { 
        task_11840_0.skipBytes((InputStream) null, 1);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11840", e);
      }
  }
}
