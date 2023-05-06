/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:40:33 GMT 2023
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
      char[] charArray0 = new char[2];
      task_2291.storeVectorIntoCharArray(vector0, charArray0, (-1011));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Character> vector0 = new Vector<Character>();
      char[] charArray0 = new char[2];
      vector0.add(0, (Character) charArray0[1]);
      // Undeclared exception!
      try { 
        task_2291.storeVectorIntoCharArray(vector0, charArray0, 1422);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1422
         //
         verifyException("com.example.task_evaluated.task_2291", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      char[] charArray0 = new char[7];
      // Undeclared exception!
      try { 
        task_2291.storeVectorIntoCharArray((Vector<Character>) null, charArray0, 1316);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2291", e);
      }
  }
}
