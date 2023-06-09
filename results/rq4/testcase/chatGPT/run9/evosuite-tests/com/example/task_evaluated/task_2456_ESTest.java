/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:35:10 GMT 2023
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
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      task_2456.storeVector(byteArray0, (-577), 0, vector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(860);
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 256, (byte)5, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 256
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(0);
      boolean boolean0 = vector0.add(integer0);
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 1, (-250), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        task_2456.storeVector(byteArray0, 2596, (-1402), (Vector<Integer>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2456", e);
      }
  }
}
