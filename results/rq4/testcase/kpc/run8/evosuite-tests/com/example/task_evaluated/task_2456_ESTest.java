/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:03:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2456;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2456_ESTest extends task_2456_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2456 task_2456_0 = new task_2456();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2456.storeVector((byte[]) null, (-1888), (-1888), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array size is not sufficient to store the vector
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer((-300));
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 0, 30, vector0);
      } catch(IllegalArgumentException e) {
         //
         // Vector must contain only 0s and 1s
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer((byte)0);
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (byte) (-1), (byte) (-1), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(1);
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 1, 1, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>(2168);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 2565, 446, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Offset is out of range
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (byte) (-116), 3675, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Offset is out of range
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      Vector<Integer> vector0 = new Vector<Integer>();
      task_2456.storeVector(byteArray0, (byte)0, (byte)102, vector0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 0, (byte)0, vector0);
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (-3572), (-3572), (Vector<Integer>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }
}