/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:41:00 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_8263;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_8263_ESTest extends task_8263_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_8263 task_8263_0 = new task_8263();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = task_8263.containsElement((Set<Object>) linkedHashSet0, (Object) linkedHashSet0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        task_8263.containsElement((Set<Object>) linkedHashSet0, (Object) null);
      } catch(NullPointerException e) {
         //
         // This set does not permit null elements
         //
         verifyException("com.example.task_evaluated.task_8263", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet0.add((Object) null);
      boolean boolean1 = task_8263.containsElement((Set<Object>) linkedHashSet0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_8263.containsElement((Set<Object>) null, object0);
      } catch(NullPointerException e) {
      }
  }
}