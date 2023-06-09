/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:20:26 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14200;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14200_ESTest extends task_14200_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14200 task_14200_0 = new task_14200();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<LinkedList<Object>> linkedList0 = new LinkedList<LinkedList<Object>>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      task_14200.ensureContains((Collection<LinkedList<Object>>) linkedList0, linkedList1);
      boolean boolean0 = linkedList1.offer(linkedList0);
      // Undeclared exception!
      try { 
        task_14200.ensureContains((Collection<Object>) linkedList1, (Object) linkedList1);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      task_14200.ensureContains((Collection<Object>) linkedList0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) null);
      task_14200.ensureContains((Collection<Object>) linkedList0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_14200.ensureContains((Collection<LinkedList<String>>) null, linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14200.ensureContains((Collection<Integer>) null, (Integer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      Object object0 = new Object();
      task_14200.ensureContains((Collection<Object>) linkedList0, object0);
      // Undeclared exception!
      try { 
        task_14200.ensureContains((Collection<Object>) list0, (Object) list0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
