/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:06:43 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_20057;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_20057_ESTest extends task_20057_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      // Undeclared exception!
      try { 
        task_20057_0.bulkCopy((byte[]) null, 1, (byte[]) null, 1, 326);
      } catch(NullPointerException e) {
         //
         // Source and target arrays must not be null
         //
         verifyException("com.example.task_evaluated.task_20057", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        task_20057_0.bulkCopy(byteArray0, (byte) (-107), (byte[]) null, (-122), 0);
      } catch(NullPointerException e) {
         //
         // Source and target arrays must not be null
         //
         verifyException("com.example.task_evaluated.task_20057", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        task_20057_0.bulkCopy(byteArray0, 1117, byteArray0, (-1), (-607));
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_20057", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        task_20057_0.bulkCopy(byteArray0, (byte) (-1), byteArray0, (byte) (-1), (byte) (-1));
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_20057", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      byte[] byteArray0 = new byte[1];
      task_20057_0.bulkCopy(byteArray0, 0, byteArray0, 0, 0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      byte[] byteArray0 = new byte[5];
      // Undeclared exception!
      try { 
        task_20057_0.bulkCopy(byteArray0, (byte)0, byteArray0, 1, (byte) (-89));
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_20057", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        task_20057_0.bulkCopy(byteArray0, 1470, byteArray0, 1470, 1470);
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_20057", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      task_20057 task_20057_0 = new task_20057();
      byte[] byteArray0 = new byte[4];
      // Undeclared exception!
      try { 
        task_20057_0.bulkCopy(byteArray0, (byte)1, byteArray0, (byte)56, 0);
      } catch(IndexOutOfBoundsException e) {
         //
         // Copying would cause access of data outside array bounds
         //
         verifyException("com.example.task_evaluated.task_20057", e);
      }
  }
}
