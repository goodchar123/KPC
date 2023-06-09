/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:55:56 GMT 2023
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
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14328.removeAll((Collection<String>) null, (Collection<?>) null);
      } catch(NullPointerException e) {
         //
         // specified collection is null
         //
         verifyException("com.example.task_evaluated.task_14328", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      task_14328 task_14328_0 = new task_14328();
      boolean boolean0 = linkedList0.add((Object) task_14328_0);
      task_14328.removeAll((Collection<Object>) linkedList0, (Collection<?>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      task_14328 task_14328_0 = new task_14328();
      boolean boolean0 = linkedList0.add((Object) task_14328_0);
      LinkedList<Object> linkedList1 = new LinkedList<Object>(linkedList0);
      // Undeclared exception!
      try { 
        task_14328.removeAll((Collection<Object>) linkedList1, (Collection<?>) linkedList0);
      } catch(ClassCastException e) {
         //
         // types of one or more elements in this collection are incompatible with the specified collection
         //
         verifyException("com.example.task_evaluated.task_14328", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        task_14328.removeAll((Collection<Integer>) null, (Collection<?>) linkedList0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
