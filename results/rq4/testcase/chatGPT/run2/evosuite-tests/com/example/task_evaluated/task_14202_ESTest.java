/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:35:15 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14202;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14202_ESTest extends task_14202_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14202 task_14202_0 = new task_14202();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) "");
      boolean boolean1 = task_14202.containsAll((Collection<Object>) linkedList0, (Collection<Object>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      boolean boolean0 = linkedList1.add("com.example.task_evaluated.task_14202");
      boolean boolean1 = task_14202.containsAll((Collection<String>) linkedList0, (Collection<String>) linkedList1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14202.containsAll((Collection<Object>) null, (Collection<Object>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14202", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      boolean boolean0 = linkedList0.add((Object) "");
      // Undeclared exception!
      try { 
        task_14202.containsAll((Collection<Object>) list0, (Collection<Object>) list0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}