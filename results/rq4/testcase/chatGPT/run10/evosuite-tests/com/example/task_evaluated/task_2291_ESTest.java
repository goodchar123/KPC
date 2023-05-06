/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:50:24 GMT 2023
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
      boolean boolean0 = vector0.add((Character) charArray0[0]);
      task_2291.storeVectorIntoCharArray(vector0, charArray0, 0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Character> vector0 = new Vector<Character>();
      char[] charArray0 = new char[6];
      boolean boolean0 = vector0.add((Character) charArray0[1]);
      // Undeclared exception!
      try { 
        task_2291.storeVectorIntoCharArray(vector0, charArray0, (-1814));
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1814
         //
         verifyException("com.example.task_evaluated.task_2291", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<Character> vector0 = new Vector<Character>(0);
      Character character0 = Character.valueOf('<');
      boolean boolean0 = vector0.add(character0);
      // Undeclared exception!
      try { 
        task_2291.storeVectorIntoCharArray(vector0, (char[]) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2291", e);
      }
  }
}