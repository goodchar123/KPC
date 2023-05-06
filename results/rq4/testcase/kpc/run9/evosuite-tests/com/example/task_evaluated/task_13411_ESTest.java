/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:32:16 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13411;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13411_ESTest extends task_13411_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13411 task_13411_0 = new task_13411();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) task_13411_0);
      int int0 = task_13411.lastIndexOf(linkedList0, task_13411_0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_13411 task_13411_0 = new task_13411();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) task_13411_0);
      int int0 = task_13411.lastIndexOf(linkedList0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_13411 task_13411_0 = new task_13411();
      // Undeclared exception!
      try { 
        task_13411.lastIndexOf((List<?>) null, task_13411_0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13411", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) linkedList1);
      boolean boolean1 = linkedList1.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        task_13411.lastIndexOf(linkedList1, linkedList1);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      boolean boolean0 = linkedList0.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        task_13411.lastIndexOf(list0, linkedList0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}