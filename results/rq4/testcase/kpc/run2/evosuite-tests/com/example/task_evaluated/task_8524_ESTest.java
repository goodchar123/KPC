/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 11:40:25 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_8524;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_8524_ESTest extends task_8524_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_8524 task_8524_0 = new task_8524();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList0);
      } catch(UnsupportedOperationException e) {
         //
         // removeAll method not supported by this collection
         //
         verifyException("com.example.task_evaluated.task_8524", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<Object>) null, (Collection<?>) null);
      } catch(NullPointerException e) {
         //
         // specified collection is null
         //
         verifyException("com.example.task_evaluated.task_8524", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      boolean boolean0 = linkedList0.add(object0);
      task_8524.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) "");
      LinkedList<String> linkedList1 = new LinkedList<String>();
      boolean boolean1 = linkedList1.add("");
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<String>) linkedList1, (Collection<?>) linkedList0);
      } catch(ClassCastException e) {
         //
         // types of one or more elements in this collection are incompatible with the specified collection
         //
         verifyException("com.example.task_evaluated.task_8524", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<Integer>) null, (Collection<?>) linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add(linkedList1);
      linkedList1.addFirst(linkedList0);
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<LinkedList<Object>>) linkedList0, (Collection<?>) linkedList1);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      boolean boolean0 = linkedList0.add("");
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<String>) list0, (Collection<?>) linkedList1);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
