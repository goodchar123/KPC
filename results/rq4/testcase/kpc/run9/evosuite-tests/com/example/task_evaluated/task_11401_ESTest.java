/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:46:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_11401;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_11401_ESTest extends task_11401_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_11401 task_11401_0 = new task_11401();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(0);
      task_11401.compactBuffer(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      // Undeclared exception!
      try { 
        task_11401.compactBuffer(byteBuffer1);
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11401", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_11401.compactBuffer((ByteBuffer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_11401", e);
      }
  }
}
