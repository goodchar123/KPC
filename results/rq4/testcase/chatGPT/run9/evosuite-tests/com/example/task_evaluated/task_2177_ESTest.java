/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:06:04 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2177;
import java.nio.ByteOrder;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2177_ESTest extends task_2177_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2177 task_2177_0 = new task_2177();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<String> vector0 = new Vector<String>();
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      task_2177.storeVector(byteArray0, 0, vector0, byteOrder0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = new Object();
      vector0.add((int) (byte)0, object0);
      // Undeclared exception!
      try { 
        task_2177.storeVector(byteArray0, 0, vector0, byteOrder0);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Float
         //
         verifyException("com.example.task_evaluated.task_2177", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Vector<Object> vector0 = new Vector<Object>();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      // Undeclared exception!
      try { 
        task_2177.storeVector(byteArray0, (-6538), vector0, byteOrder0);
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Vector<Integer> vector0 = new Vector<Integer>();
      boolean boolean0 = vector0.add((Integer) null);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      // Undeclared exception!
      try { 
        task_2177.storeVector(byteArray0, 0, vector0, byteOrder0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2177", e);
      }
  }
}
