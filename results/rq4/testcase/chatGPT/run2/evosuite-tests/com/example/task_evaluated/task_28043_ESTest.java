/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:22:58 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_28043;
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
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) task_28043_0);
      boolean boolean1 = linkedList0.add((Object) "]WAuDh'");
      Object object0 = task_28043.getNextElementWithPrefix((List<Object>) linkedList0, "]WAuDh'");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      String string0 = task_28043.getNextElementWithPrefix((List<String>) linkedList0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_28043 task_28043_0 = new task_28043();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) task_28043_0);
      boolean boolean1 = linkedList0.add((Object) "]WAuDh'");
      Object object0 = task_28043.getNextElementWithPrefix((List<Object>) linkedList0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_28043 task_28043_0 = new task_28043();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      boolean boolean0 = linkedList0.add((Object) task_28043_0);
      boolean boolean1 = linkedList0.add((Object) "]WAuDh'");
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix((List<Object>) linkedList0, (String) null);
      } catch(NullPointerException e) {
      }
  }
}