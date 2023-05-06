/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 08:04:19 GMT 2023
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
      Integer integer0 = new Integer(1);
      boolean boolean0 = linkedList0.add((Object) "MO`g)[vvp':88h&E%");
      boolean boolean1 = linkedList0.add((Object) integer0);
      Object object0 = task_28043.getNextElementWithPrefix((List<Object>) linkedList0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(1);
      boolean boolean0 = linkedList0.add((Object) "MO`g)[vvp':88h&E%");
      boolean boolean1 = linkedList0.add((Object) integer0);
      Object object0 = task_28043.getNextElementWithPrefix((List<Object>) linkedList0, "|m]|:R50fi}$l");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("%");
      boolean boolean1 = linkedList0.add("");
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix((List<String>) linkedList0, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1654));
      linkedList0.push(integer0);
      List<Integer> list0 = linkedList0.subList(1, 1);
      boolean boolean0 = linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix(list0, "Q9,R'A|57L].Y26@n6java.lang.String@0000000001java.lang.Integer@0000000001");
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
