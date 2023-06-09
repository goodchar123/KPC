/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:02:04 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_10143;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_10143_ESTest extends task_10143_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_10143 task_10143_0 = new task_10143();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      task_10143.writeToByteArrayOutputStream(byteArray0, (byte)0, (byte)0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_10143.writeToByteArrayOutputStream((byte[]) null, (-1674), 0);
      } catch(NullPointerException e) {
         //
         // byte array is null
         //
         verifyException("com.example.task_evaluated.task_10143", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        task_10143.writeToByteArrayOutputStream(byteArray0, (byte) (-1), (byte) (-1));
      } catch(IndexOutOfBoundsException e) {
         //
         // off or len is out of bounds
         //
         verifyException("com.example.task_evaluated.task_10143", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        task_10143.writeToByteArrayOutputStream(byteArray0, (byte)0, (-1626));
      } catch(IndexOutOfBoundsException e) {
         //
         // off or len is out of bounds
         //
         verifyException("com.example.task_evaluated.task_10143", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        task_10143.writeToByteArrayOutputStream(byteArray0, 1, 1);
      } catch(IndexOutOfBoundsException e) {
         //
         // off or len is out of bounds
         //
         verifyException("com.example.task_evaluated.task_10143", e);
      }
  }
}
