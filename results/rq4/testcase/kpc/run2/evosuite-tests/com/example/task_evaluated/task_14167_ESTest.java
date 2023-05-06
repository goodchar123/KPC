/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 23:29:24 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14167;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14167_ESTest extends task_14167_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14167 task_14167_0 = new task_14167();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-2990));
      // Undeclared exception!
      try { 
        task_14167.lastIndexOf(linkedList0, integer0);
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14167", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        task_14167.lastIndexOf(linkedList0, (Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14167", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        task_14167.lastIndexOf(linkedList0, (Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-2990));
      boolean boolean0 = linkedList0.add(integer0);
      int int0 = task_14167.lastIndexOf(linkedList0, integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("");
      boolean boolean1 = linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        task_14167.lastIndexOf(linkedList0, (Object) null);
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14167", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-2990));
      boolean boolean0 = linkedList0.add(integer0);
      Integer integer1 = new Integer(0);
      // Undeclared exception!
      try { 
        task_14167.lastIndexOf(linkedList0, integer1);
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14167", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = linkedList1.add((Object) linkedList0);
      boolean boolean1 = linkedList0.add((Object) linkedList1);
      // Undeclared exception!
      try { 
        task_14167.lastIndexOf(linkedList0, linkedList0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
