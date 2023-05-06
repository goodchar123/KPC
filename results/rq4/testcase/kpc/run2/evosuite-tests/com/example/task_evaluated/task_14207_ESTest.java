/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 23:39:00 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14207;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14207_ESTest extends task_14207_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14207 task_14207_0 = new task_14207();
      // Undeclared exception!
      try { 
        task_14207_0.removeAllElements((Collection<?>) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14207", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14207 task_14207_0 = new task_14207();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      task_14207_0.removeAllElements(linkedList0);
  }
}
