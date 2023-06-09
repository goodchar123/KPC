/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:38:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14328;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14328_ESTest extends task_14328_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14328 task_14328_0 = new task_14328();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        task_14328.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList0);
      } catch(UnsupportedOperationException e) {
         //
         // removeAll method not supported by this collection
         //
         verifyException("com.example.task_evaluated.task_14328", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        task_14328.removeAll((Collection<Object>) linkedList0, (Collection<?>) null);
      } catch(NullPointerException e) {
         //
         // specified collection is null
         //
         verifyException("com.example.task_evaluated.task_14328", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) null);
      task_14328.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add((Object) "ke-&L(;a8d{2o_L5-g");
      boolean boolean1 = linkedList1.add("ke-&L(;a8d{2o_L5-g");
      // Undeclared exception!
      try { 
        task_14328.removeAll((Collection<String>) linkedList1, (Collection<?>) linkedList0);
      } catch(ClassCastException e) {
         //
         // types of one or more elements in this collection are incompatible with the specified collection
         //
         verifyException("com.example.task_evaluated.task_14328", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        task_14328.removeAll((Collection<Object>) null, (Collection<?>) linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
