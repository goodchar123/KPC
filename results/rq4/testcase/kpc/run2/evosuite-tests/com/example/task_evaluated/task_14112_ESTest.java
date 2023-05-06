/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 17:43:55 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14112;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14112_ESTest extends task_14112_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14112 task_14112_0 = new task_14112();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        task_14112.contains((Set<Object>) linkedHashSet0, (Object) linkedHashSet0);
      } catch(ClassCastException e) {
         //
         // The type of the specified element is incompatible with this set
         //
         verifyException("com.example.task_evaluated.task_14112", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = linkedHashSet0.add("");
      boolean boolean1 = task_14112.contains((Set<String>) linkedHashSet0, (Object) "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14112.contains((Set<String>) null, (Object) "");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedHashSet<LinkedHashSet<Object>> linkedHashSet0 = new LinkedHashSet<LinkedHashSet<Object>>();
      LinkedHashSet<Object> linkedHashSet1 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet1.add(linkedHashSet0);
      boolean boolean1 = linkedHashSet0.add(linkedHashSet1);
      // Undeclared exception!
      try { 
        task_14112.contains((Set<LinkedHashSet<Object>>) linkedHashSet0, (Object) linkedHashSet0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
