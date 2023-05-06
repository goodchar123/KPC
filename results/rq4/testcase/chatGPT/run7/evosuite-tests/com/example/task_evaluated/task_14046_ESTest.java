/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 07:51:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14046;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14046_ESTest extends task_14046_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14046.getListIterator((List<String>) null, 2871);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14046", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14046 task_14046_0 = new task_14046();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_14046.getListIterator(linkedList0, (-857));
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -857, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }
}
