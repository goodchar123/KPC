/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:20:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2287;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2287_ESTest extends task_2287_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2287 task_2287_0 = new task_2287();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      short[] shortArray0 = new short[5];
      Vector<Short> vector0 = new Vector<Short>();
      boolean boolean0 = vector0.add((Short) shortArray0[4]);
      task_2287.storeVector(shortArray0, 0, vector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Short> vector0 = new Vector<Short>();
      Short short0 = new Short((short)0);
      boolean boolean0 = vector0.add(short0);
      // Undeclared exception!
      try { 
        task_2287.storeVector((short[]) null, (-2379), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: -2379
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      short[] shortArray0 = new short[4];
      Vector<Short> vector0 = new Vector<Short>();
      boolean boolean0 = vector0.add((Short) (short)0);
      // Undeclared exception!
      try { 
        task_2287.storeVector(shortArray0, 2181, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: 2181
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      short[] shortArray0 = new short[0];
      Vector<Short> vector0 = new Vector<Short>();
      Short short0 = new Short((short)534);
      boolean boolean0 = vector0.add(short0);
      // Undeclared exception!
      try { 
        task_2287.storeVector(shortArray0, 0, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      short[] shortArray0 = new short[6];
      // Undeclared exception!
      try { 
        task_2287.storeVector(shortArray0, (-1), (Vector<Short>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }
}
