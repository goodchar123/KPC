/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:53:46 GMT 2023
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
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      Integer integer0 = new Integer((-2582));
      task_14112.addIfNotPresent((Set<Integer>) linkedHashSet0, integer0);
      task_14112.addIfNotPresent((Set<Integer>) linkedHashSet0, integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_14112.addIfNotPresent((Set<String>) null, "");
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      LinkedHashSet<Object> linkedHashSet1 = new LinkedHashSet<Object>();
      task_14112.addIfNotPresent((Set<Object>) linkedHashSet1, (Object) linkedHashSet1);
      // Undeclared exception!
      try { 
        task_14112.addIfNotPresent((Set<Object>) linkedHashSet0, (Object) linkedHashSet1);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
