/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:13:36 GMT 2023
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
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("java.lan");
      boolean boolean1 = linkedList0.add("&Q$}java.lang.String@0000000003");
      String string0 = task_28043.getNextElementWithPrefix((List<String>) linkedList0, "Ocwi=v)m^alE\"");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("Dp<K5u");
      boolean boolean1 = linkedList0.add("");
      String string0 = task_28043.getNextElementWithPrefix((List<String>) linkedList0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("}*}4V");
      linkedList0.addFirst("");
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix((List<String>) linkedList0, (String) null);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.clear();
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix(list0, "ZnpiQTo,<QJ.");
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }
}
