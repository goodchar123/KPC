/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:35:04 GMT 2023
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
      boolean boolean0 = vector0.add((Short) (short)0);
      // Undeclared exception!
      try { 
        task_2287.storeVector(shortArray0, (short)2309, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: 2309
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      short[] shortArray0 = new short[8];
      Vector<Short> vector0 = new Vector<Short>();
      boolean boolean0 = vector0.add((Short) (short)48);
      // Undeclared exception!
      try { 
        task_2287.storeVector(shortArray0, (-2406), vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: -2406
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      short[] shortArray0 = new short[8];
      Vector<Short> vector0 = new Vector<Short>();
      boolean boolean0 = vector0.add((Short) (short)48);
      task_2287.storeVector(shortArray0, 0, vector0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      short[] shortArray0 = new short[1];
      Vector<Short> vector0 = new Vector<Short>();
      boolean boolean0 = vector0.add((Short) (short)0);
      boolean boolean1 = vector0.add((Short) shortArray0[0]);
      // Undeclared exception!
      try { 
        task_2287.storeVector(shortArray0, (short)0, vector0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Vector<Short> vector0 = new Vector<Short>();
      Short short0 = new Short((short) (-776));
      boolean boolean0 = vector0.add(short0);
      // Undeclared exception!
      try { 
        task_2287.storeVector((short[]) null, 0, vector0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2287", e);
      }
  }
}
