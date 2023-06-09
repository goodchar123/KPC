/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:14:43 GMT 2023
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
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1));
      boolean boolean0 = linkedList0.add(integer0);
      boolean boolean1 = task_14202.containsAll((Collection<Integer>) linkedList0, (Collection<Integer>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      boolean boolean0 = linkedList1.add((Object) integer0);
      boolean boolean1 = task_14202.containsAll((Collection<Object>) linkedList0, (Collection<Object>) linkedList1);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
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
}
