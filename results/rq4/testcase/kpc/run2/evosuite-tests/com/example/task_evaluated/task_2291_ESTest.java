/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 22:57:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2291;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2291_ESTest extends task_2291_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2291 task_2291_0 = new task_2291();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Character> vector0 = new Vector<Character>();
      char[] charArray0 = new char[6];
      boolean boolean0 = vector0.add((Character) 'H');
      task_2291.storeVectorIntoCharArray(vector0, charArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Character> vector0 = new Vector<Character>();
      char[] charArray0 = new char[9];
      boolean boolean0 = vector0.add((Character) '_');
      // Undeclared exception!
      try { 
        task_2291.storeVectorIntoCharArray(vector0, charArray0, (-2327));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: -2327
         //
         verifyException("com.example.task_evaluated.task_2291", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<Character> vector0 = new Vector<Character>();
      Character character0 = Character.valueOf('@');
      boolean boolean0 = vector0.add(character0);
      char[] charArray0 = new char[0];
      // Undeclared exception!
      try { 
        task_2291.storeVectorIntoCharArray(vector0, charArray0, 0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index out of range: 0
         //
         verifyException("com.example.task_evaluated.task_2291", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector<Character> vector0 = new Vector<Character>();
      char[] charArray0 = new char[9];
      boolean boolean0 = vector0.add((Character) null);
      // Undeclared exception!
      try { 
        task_2291.storeVectorIntoCharArray(vector0, charArray0, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2291", e);
      }
  }
}
