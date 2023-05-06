/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:46:20 GMT 2023
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
      byte[] byteArray0 = new byte[1];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(0);
      boolean boolean0 = vector0.add(integer0);
      task_2456.storeVector(byteArray0, 0, 0, vector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer((-1));
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (-1950), (-376), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1950
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer((-2897));
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 958, 958, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 958
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Vector<Integer> vector0 = new Vector<Integer>();
      boolean boolean0 = vector0.add((Integer) null);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, (byte) (-11), 1, vector0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }
}