/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 04:46:18 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14915;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14915_ESTest extends task_14915_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14915 task_14915_0 = new task_14915();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Integer integer0 = new Integer(1542);
      boolean boolean0 = task_14915.containsElement((Set<Integer>) linkedHashSet0, integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      // Undeclared exception!
      try { 
        task_14915.containsElement((Set<Integer>) linkedHashSet0, (Integer) null);
      } catch(NullPointerException e) {
         //
         // This set does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14915", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      boolean boolean0 = linkedHashSet0.add((Integer) null);
      // Undeclared exception!
      try { 
        task_14915.containsElement((Set<Integer>) linkedHashSet0, (Integer) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14915", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Integer integer0 = new Integer((-987));
      boolean boolean0 = linkedHashSet0.add(integer0);
      boolean boolean1 = task_14915.containsElement((Set<Integer>) linkedHashSet0, integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Integer integer0 = new Integer((-987));
      boolean boolean0 = linkedHashSet0.add(integer0);
      boolean boolean1 = linkedHashSet0.add((Integer) null);
      // Undeclared exception!
      try { 
        task_14915.containsElement((Set<Integer>) linkedHashSet0, (Integer) null);
      } catch(ClassCastException e) {
         //
         // The specified element is incompatible with this set
         //
         verifyException("com.example.task_evaluated.task_14915", e);
      }
  }
}