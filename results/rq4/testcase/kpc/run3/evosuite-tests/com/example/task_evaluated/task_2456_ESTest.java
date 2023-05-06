/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 05:06:12 GMT 2023
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
  public void test00()  throws Throwable  {
      task_2456 task_2456_0 = new task_2456();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 470, 1, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Offset is out of range
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(1);
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (-1), (-1), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = Integer.valueOf((int) (byte)0);
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (-272), (-378), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -272
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer((-1));
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 1, (byte)57, vector0);
      } catch(IllegalArgumentException e) {
         //
         // Vector must contain only 0s and 1s
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer((byte)0);
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (byte) (-65), 0, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -65
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2456.storeVector((byte[]) null, 0, (-1), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array size is not sufficient to store the vector
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (-1), 321, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Offset is out of range
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Vector<Integer> vector0 = new Vector<Integer>();
      task_2456.storeVector(byteArray0, (byte)1, 3043, vector0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (byte) (-39), (byte)0, vector0);
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 0, 736, (Vector<Integer>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }
}
