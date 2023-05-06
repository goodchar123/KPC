/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:42:19 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13395;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13395_ESTest extends task_13395_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13395 task_13395_0 = new task_13395();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_13395.removeFirstOccurrence((List<String>) linkedList0, (String) null);
      } catch(NullPointerException e) {
         //
         // This list does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_13395", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_13395.removeFirstOccurrence((List<String>) linkedList0, "tC");
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("SZ*h$MSr{RO4");
      task_13395.removeFirstOccurrence((List<String>) linkedList0, "tC");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>(linkedList0);
      boolean boolean0 = linkedList1.offerFirst(linkedList0);
      // Undeclared exception!
      try { 
        task_13395.removeFirstOccurrence((List<Object>) linkedList1, (Object) "");
      } catch(ClassCastException e) {
         //
         // The type of the specified element is incompatible with this list
         //
         verifyException("com.example.task_evaluated.task_13395", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.push((Integer) null);
      task_13395.removeFirstOccurrence((List<Integer>) linkedList0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13395.removeFirstOccurrence((List<String>) null, "");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13395", e);
      }
  }
}
