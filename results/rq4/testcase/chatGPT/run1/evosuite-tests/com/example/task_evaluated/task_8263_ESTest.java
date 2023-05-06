/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:03:59 GMT 2023
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
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = task_8263.containsElement(linkedHashSet0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      boolean boolean0 = linkedHashSet0.add("");
      boolean boolean1 = task_8263.containsElement(linkedHashSet0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_8263.containsElement((Set<String>) null, "");
      } catch(NullPointerException e) {
      }
  }
}
