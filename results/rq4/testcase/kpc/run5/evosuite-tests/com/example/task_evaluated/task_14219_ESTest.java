/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 02:16:42 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14219;
import java.util.Collection;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14219_ESTest extends task_14219_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14219 task_14219_0 = new task_14219();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(1);
      boolean boolean0 = task_14219.containsElement((Collection<Object>) linkedList0, (Object) integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      // Undeclared exception!
      try { 
        task_14219.containsElement((Collection<String>) linkedList0, (String) null);
      } catch(NullPointerException e) {
         //
         // This collection does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14219", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.push((String) null);
      boolean boolean0 = task_14219.containsElement((Collection<String>) linkedList0, (String) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14219.containsElement((Collection<String>) null, "com.example.task_evaluated.task_14219");
      } catch(NullPointerException e) {
      }
  }
}