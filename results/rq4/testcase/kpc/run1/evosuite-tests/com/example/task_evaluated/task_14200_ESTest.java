/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 19:26:31 GMT 2023
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
      Integer integer0 = new Integer(210);
      // Undeclared exception!
      try { 
        task_14200.ensureContains((Collection<Integer>) null, integer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      task_14200.ensureContains((Collection<Object>) linkedList0, (Object) null);
      task_14200.ensureContains((Collection<Object>) linkedList0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14200.ensureContains((Collection<Object>) null, (Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = linkedList1.offerFirst(linkedList0);
      boolean boolean1 = linkedList0.add((Object) linkedList1);
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
  public void test4()  throws Throwable  {
      task_14200 task_14200_0 = new task_14200();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) task_14200_0);
      List<Object> list0 = linkedList0.subList(1, 1);
      task_14200.ensureContains((Collection<Object>) linkedList0, (Object) linkedList0);
      Integer integer0 = new Integer(1);
      // Undeclared exception!
      try { 
        task_14200.ensureContains((Collection<Object>) list0, (Object) integer0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
