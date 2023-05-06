/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:47:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14201;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14201_ESTest extends task_14201_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14201 task_14201_0 = new task_14201();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      boolean boolean0 = task_14201.removeElement((Collection<String>) null, " !1C.J W");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = task_14201.removeElement((Collection<Object>) linkedList0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ListIterator<Object> listIterator0 = linkedList0.listIterator();
      List<Object> list0 = linkedList0.subList(0, 0);
      boolean boolean0 = linkedList0.add((Object) listIterator0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_14201.removeElement((Collection<Object>) list0, object0);
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
