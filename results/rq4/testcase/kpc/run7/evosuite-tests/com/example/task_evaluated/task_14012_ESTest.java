/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:54:57 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14012;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14012_ESTest extends task_14012_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14012 task_14012_0 = new task_14012();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = task_14012.getElementAtIndex((List<String>) null, 1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = task_14012.getElementAtIndex((List<Object>) linkedList0, (-622));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) null);
      Object object0 = task_14012.getElementAtIndex((List<Object>) linkedList0, 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) null);
      // Undeclared exception!
      try { 
        task_14012.getElementAtIndex((List<Object>) linkedList0, (-1));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index is out of range
         //
         verifyException("com.example.task_evaluated.task_14012", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.offer((Object) null);
      // Undeclared exception!
      try { 
        task_14012.getElementAtIndex((List<Object>) linkedList0, 2195);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index is out of range
         //
         verifyException("com.example.task_evaluated.task_14012", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      boolean boolean0 = linkedList0.add("");
      // Undeclared exception!
      try { 
        task_14012.getElementAtIndex(list0, (-1));
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
