/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 06:24:42 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_8528;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_8528_ESTest extends task_8528_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_8528 task_8528_0 = new task_8528();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      task_8528.appendAll((List<Integer>) linkedList0, (Collection<? extends Integer>) linkedList0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-3422));
      boolean boolean0 = linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        task_8528.appendAll((List<Integer>) linkedList0, (Collection<? extends Integer>) linkedList0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        task_8528.appendAll((List<Integer>) linkedList0, (Collection<? extends Integer>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_8528", e);
      }
  }
}
