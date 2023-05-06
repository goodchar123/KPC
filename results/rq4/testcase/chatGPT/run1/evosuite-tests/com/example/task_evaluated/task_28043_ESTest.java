/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:15:34 GMT 2023
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
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("I=jb'Z*9.W");
      LinkedList<Object> linkedList1 = new LinkedList<Object>(linkedList0);
      boolean boolean1 = linkedList1.add((Object) "$f?\"B,@IboSr");
      Object object0 = task_28043.getNextElementWithPrefix((List<Object>) linkedList1, "7s\" |B~%Wx|RY2ZG-");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("I=jb'Z*9.W");
      LinkedList<Object> linkedList1 = new LinkedList<Object>(linkedList0);
      boolean boolean1 = linkedList1.add((Object) "$f?\"B,@IboSr");
      Object object0 = task_28043.getNextElementWithPrefix((List<Object>) linkedList1, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-840));
      boolean boolean0 = linkedList0.add((Integer) null);
      boolean boolean1 = linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        task_28043.getNextElementWithPrefix((List<Integer>) linkedList0, "9t_X6\"$\"*");
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
