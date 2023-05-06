/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:52:32 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14202;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14202_ESTest extends task_14202_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14202 task_14202_0 = new task_14202();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) null);
      boolean boolean1 = task_14202.containsAll((Collection<Object>) linkedList0, (Collection<Object>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer((-507));
      boolean boolean0 = linkedList0.add((Object) integer0);
      boolean boolean1 = linkedList0.add((Object) null);
      Object object0 = linkedList0.pop();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        task_14202.containsAll((Collection<Object>) linkedList1, (Collection<Object>) linkedList0);
      } catch(NullPointerException e) {
         //
         // This collection does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14202", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      LinkedList<String> linkedList1 = new LinkedList<String>();
      boolean boolean0 = linkedList1.add("x:tP9Vy:Q|]V");
      boolean boolean1 = task_14202.containsAll((Collection<String>) linkedList0, (Collection<String>) linkedList1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14202.containsAll((Collection<Object>) null, (Collection<Object>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14202", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) linkedList1);
      boolean boolean1 = linkedList1.add((Object) linkedList0);
      // Undeclared exception!
      try { 
        task_14202.containsAll((Collection<Object>) linkedList0, (Collection<Object>) linkedList1);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
