/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:11:26 GMT 2023
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
      byte[] byteArray0 = new byte[6];
      Vector<Object> vector0 = new Vector<Object>();
      boolean boolean0 = vector0.add((Object) task_2177_0);
      ByteOrder byteOrder0 = ByteOrder.nativeOrder();
      // Undeclared exception!
      try { 
        task_2177.storeVector(byteArray0, 0, vector0, byteOrder0);
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      // Undeclared exception!
      try { 
        task_2177.storeVector(byteArray0, (-2031), (Vector) null, byteOrder0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset is out of bounds
         //
         verifyException("com.example.task_evaluated.task_2177", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      task_2177.storeVector(byteArray0, 0, vector0, byteOrder0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Vector<String> vector0 = new Vector<String>();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      // Undeclared exception!
      try { 
        task_2177.storeVector(byteArray0, 1063, vector0, byteOrder0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Offset is out of bounds
         //
         verifyException("com.example.task_evaluated.task_2177", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      boolean boolean0 = vector0.add((Integer) null);
      // Undeclared exception!
      try { 
        task_2177.storeVector(byteArray0, 0, vector0, byteOrder0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Length is out of bounds
         //
         verifyException("com.example.task_evaluated.task_2177", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2177.storeVector((byte[]) null, 0, vector0, (ByteOrder) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
