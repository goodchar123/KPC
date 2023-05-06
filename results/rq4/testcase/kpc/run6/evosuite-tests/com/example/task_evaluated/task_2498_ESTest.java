/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 06:30:31 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2498;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2498_ESTest extends task_2498_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_2498 task_2498_0 = new task_2498();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Vector<Integer> vector1 = task_2498.createShuffle(vector0, vector0);
      vector1.setSize(2412);
      Vector<Integer> vector2 = task_2498.createShuffle(vector1, vector1);
      Vector<Integer> vector3 = task_2498.createShuffle(vector2, vector0);
      Vector<Integer> vector4 = task_2498.createShuffle(vector3, vector0);
      // Undeclared exception!
      task_2498.createShuffle(vector2, vector0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(0);
      boolean boolean0 = vector0.add(integer0);
      Vector<Integer> vector1 = task_2498.createShuffle(vector0, vector0);
      Vector<Integer> vector2 = task_2498.createShuffle(vector1, vector0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      Integer integer0 = new Integer(0);
      boolean boolean0 = vector0.add(integer0);
      Vector<Integer> vector1 = task_2498.createShuffle(vector0, vector0);
      Vector<Integer> vector2 = task_2498.createShuffle(vector0, vector1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_2498.createShuffle((Vector<Integer>) null, (Vector<Integer>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
