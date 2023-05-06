/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:44:11 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14219;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14219_ESTest extends task_14219_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14219 task_14219_0 = new task_14219();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(269);
      boolean boolean0 = task_14219.containsElement((Collection<Integer>) linkedList0, integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        task_14219.containsElement((Collection<Object>) linkedList0, (Object) null);
      } catch(NullPointerException e) {
         //
         // This collection does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14219", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) null);
      boolean boolean1 = task_14219.containsElement((Collection<Object>) linkedList0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        task_14219.containsElement((Collection<Integer>) null, integer0);
      } catch(NullPointerException e) {
      }
  }
}
