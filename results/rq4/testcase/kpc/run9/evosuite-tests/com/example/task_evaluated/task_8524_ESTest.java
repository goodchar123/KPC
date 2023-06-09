/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 15:00:23 GMT 2023
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
      boolean boolean0 = linkedList0.add((Object) "GS?{NE1jBj0O;^mUPKB");
      task_8524.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      Integer integer0 = new Integer(2252);
      boolean boolean0 = linkedList1.add((Object) integer0);
      boolean boolean1 = linkedList0.add((Object) integer0);
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList1);
      } catch(ClassCastException e) {
         //
         // types of one or more elements in this collection are incompatible with the specified collection
         //
         verifyException("com.example.task_evaluated.task_8524", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<Object>) null, (Collection<?>) linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_8524", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) linkedList1);
      boolean boolean1 = linkedList1.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList1);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(2252);
      boolean boolean0 = linkedList0.add((Object) integer0);
      List<Object> list0 = linkedList0.subList(1, 1);
      boolean boolean1 = linkedList0.add((Object) integer0);
      // Undeclared exception!
      try { 
        task_8524.removeAll((Collection<Object>) list0, (Collection<?>) linkedList0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
