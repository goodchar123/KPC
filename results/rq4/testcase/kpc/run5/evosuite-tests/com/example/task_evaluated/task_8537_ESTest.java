/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:23:39 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_8537;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_8537_ESTest extends task_8537_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_8537 task_8537_0 = new task_8537();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_8537.getListIterator(linkedList0, (-1391));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index out of range: -1391
         //
         verifyException("com.example.task_evaluated.task_8537", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = task_8537.getListIterator(linkedList0, 0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_8537.getListIterator(linkedList0, 1024);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index out of range: 1024
         //
         verifyException("com.example.task_evaluated.task_8537", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_8537.getListIterator((List<String>) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_8537", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      List<String> list0 = linkedList0.subList(0, 0);
      boolean boolean0 = linkedList0.add("hfY");
      // Undeclared exception!
      try { 
        task_8537.getListIterator(list0, 1);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
