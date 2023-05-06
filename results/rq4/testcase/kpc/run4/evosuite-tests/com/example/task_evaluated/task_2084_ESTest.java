/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:32:26 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_2084;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_2084_ESTest extends task_2084_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[4];
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2084.storeVector(intArray0, 4680, (-357), vector0);
      } catch(ArrayStoreException e) {
         //
         // An element in the src array could not be stored into the dest array because of a type mismatch.
         //
         verifyException("com.example.task_evaluated.task_2084", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_2084 task_2084_0 = new task_2084();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Vector<Integer> vector0 = new Vector<Integer>();
      // Undeclared exception!
      try { 
        task_2084.storeVector((int[]) null, 0, 0, vector0);
      } catch(NullPointerException e) {
         //
         // Either src or dest is null.
         //
         verifyException("com.example.task_evaluated.task_2084", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        task_2084.storeVector(intArray0, 0, (-1254), (Vector<Integer>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_2084", e);
      }
  }
}
