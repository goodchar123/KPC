/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 18:56:27 GMT 2023
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
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = task_14915.containsElement(linkedHashSet0, "com.example.task_evaluated.task_14915");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = linkedHashSet0.add("s<.%57L");
      boolean boolean1 = task_14915.containsElement(linkedHashSet0, "s<.%57L");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14915.containsElement((Set<String>) null, "");
      } catch(NullPointerException e) {
      }
  }
}
