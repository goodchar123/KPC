/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 22:13:09 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14201;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14201_ESTest extends task_14201_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14201 task_14201_0 = new task_14201();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        task_14201.removeElement((Collection<Integer>) linkedList0, (Integer) null);
      } catch(NullPointerException e) {
         //
         // This collection does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14201", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      boolean boolean0 = task_14201.removeElement((Collection<Object>) null, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = task_14201.removeElement((Collection<Object>) linkedList0, (Object) linkedList0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = linkedList0.add((Integer) null);
      boolean boolean1 = task_14201.removeElement((Collection<Integer>) linkedList0, (Integer) null);
  }
}
