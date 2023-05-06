/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:52:36 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13413;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13413_ESTest extends task_13413_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13413 task_13413_0 = new task_13413();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_13413.getListIterator(linkedList0, (-635));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index out of range: -635
         //
         verifyException("com.example.task_evaluated.task_13413", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_13413.getListIterator(linkedList0, 781);
      } catch(IndexOutOfBoundsException e) {
         //
         // Index out of range: 781
         //
         verifyException("com.example.task_evaluated.task_13413", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ListIterator<String> listIterator0 = task_13413.getListIterator(linkedList0, 0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13413.getListIterator((List<String>) null, 0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13413", e);
      }
  }
}