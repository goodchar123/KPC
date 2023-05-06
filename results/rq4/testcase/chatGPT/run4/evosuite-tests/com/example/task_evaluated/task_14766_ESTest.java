/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:36:32 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14766;
import java.util.LinkedList;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14766_ESTest extends task_14766_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14766 task_14766_0 = new task_14766();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Vector<Integer> vector0 = new Vector<Integer>(linkedList0);
      int[] intArray0 = new int[1];
      vector0.addElement((Integer) (-1));
      task_14766.copyVectorToArray(vector0, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Vector<Integer> vector0 = new Vector<Integer>(linkedList0);
      int[] intArray0 = new int[1];
      boolean boolean0 = vector0.add((Integer) intArray0[0]);
      boolean boolean1 = vector0.add((Integer) intArray0[0]);
      // Undeclared exception!
      try { 
        task_14766.copyVectorToArray(vector0, intArray0);
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("com.example.task_evaluated.task_14766", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        task_14766.copyVectorToArray((Vector<Integer>) null, intArray0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14766", e);
      }
  }
}
