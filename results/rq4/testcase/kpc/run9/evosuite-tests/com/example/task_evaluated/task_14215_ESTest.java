/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 14:27:46 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14215;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14215_ESTest extends task_14215_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14215 task_14215_0 = new task_14215();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = task_14215.containsElement((Collection<? extends String>) linkedList0, "P~9x4&W j");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        task_14215.containsElement((Collection<? extends Integer>) linkedList0, (Integer) null);
      } catch(NullPointerException e) {
         //
         // This collection does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14215", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = linkedList0.add((Integer) null);
      boolean boolean1 = task_14215.containsElement((Collection<? extends Integer>) linkedList0, (Integer) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      List<Object> list0 = task_14215.asList(objectArray0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14215.asList((Object[]) null);
      } catch(NullPointerException e) {
         //
         // The specified array is null
         //
         verifyException("com.example.task_evaluated.task_14215", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = new Integer((-1480));
      // Undeclared exception!
      try { 
        task_14215.containsElement((Collection<? extends Integer>) null, integer0);
      } catch(NullPointerException e) {
      }
  }
}
