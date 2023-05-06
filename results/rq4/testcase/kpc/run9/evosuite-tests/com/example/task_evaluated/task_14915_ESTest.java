/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 13:29:25 GMT 2023
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
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet0.add(task_14915_0);
      boolean boolean1 = task_14915.containsElement((Set<Object>) linkedHashSet0, (Object) task_14915_0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Integer integer0 = new Integer(0);
      boolean boolean0 = task_14915.containsElement((Set<Integer>) linkedHashSet0, integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        task_14915.containsElement((Set<Object>) linkedHashSet0, (Object) null);
      } catch(NullPointerException e) {
         //
         // This set does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_14915", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet0.add((Object) null);
      // Undeclared exception!
      try { 
        task_14915.containsElement((Set<Object>) linkedHashSet0, (Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14915", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      task_14915 task_14915_0 = new task_14915();
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet0.add(task_14915_0);
      boolean boolean1 = linkedHashSet0.add((Object) null);
      // Undeclared exception!
      try { 
        task_14915.containsElement((Set<Object>) linkedHashSet0, (Object) null);
      } catch(ClassCastException e) {
         //
         // The specified element is incompatible with this set
         //
         verifyException("com.example.task_evaluated.task_14915", e);
      }
  }
}
