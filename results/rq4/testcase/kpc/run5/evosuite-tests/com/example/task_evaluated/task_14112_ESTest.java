/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 01:51:46 GMT 2023
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
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_14112.contains((Set<String>) linkedHashSet0, object0);
      } catch(ClassCastException e) {
         //
         // The type of the specified element is incompatible with this set
         //
         verifyException("com.example.task_evaluated.task_14112", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet0.add((Object) null);
      boolean boolean1 = task_14112.contains((Set<Object>) linkedHashSet0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14112.contains((Set<Integer>) null, (Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet0.add(linkedHashSet0);
      LinkedHashSet<LinkedHashSet<Integer>> linkedHashSet1 = new LinkedHashSet<LinkedHashSet<Integer>>();
      LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<Integer>();
      Integer integer0 = new Integer((-1731));
      boolean boolean1 = linkedHashSet2.add(integer0);
      boolean boolean2 = linkedHashSet1.add(linkedHashSet2);
      // Undeclared exception!
      try { 
        task_14112.contains((Set<LinkedHashSet<Integer>>) linkedHashSet1, (Object) linkedHashSet0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
