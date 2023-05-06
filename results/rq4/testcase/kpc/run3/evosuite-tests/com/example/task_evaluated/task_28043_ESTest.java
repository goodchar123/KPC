/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:06:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_28043;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_28043_ESTest extends task_28043_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_28043 task_28043_0 = new task_28043();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      boolean boolean0 = linkedList0.add(object0);
      boolean boolean1 = linkedList0.add((Object) null);
      Object object1 = task_28043.getNextElementWithPrefix((List<Object>) linkedList0, "77xA+BlM]|q%");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer((-883));
      boolean boolean0 = linkedList0.add((Object) "{Igj69x8ih");
      boolean boolean1 = linkedList0.add((Object) integer0);
      Object object0 = task_28043.getNextElementWithPrefix((List<Object>) linkedList0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) null);
      boolean boolean1 = linkedList0.add((Object) null);
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix((List<Object>) linkedList0, "@Z");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.addLast("9fp' djN%Q;q(%>-");
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix(list0, "");
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}