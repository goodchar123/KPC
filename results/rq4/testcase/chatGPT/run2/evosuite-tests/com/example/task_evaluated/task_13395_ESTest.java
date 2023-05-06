/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 19:08:46 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13395;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13395_ESTest extends task_13395_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13395 task_13395_0 = new task_13395();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      task_13395.removeFirstOccurrence((List<Integer>) linkedList0, integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      boolean boolean0 = linkedList0.add("o;wo^&&&L~aE");
      task_13395.removeFirstOccurrence((List<String>) linkedList0, "o;wo^&&&L~aE");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      // Undeclared exception!
      try { 
        task_13395.removeFirstOccurrence((List<Integer>) null, integer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13395", e);
      }
  }
}