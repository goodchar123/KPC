/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:51:34 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14115;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14115_ESTest extends task_14115_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14115 task_14115_0 = new task_14115();
      // Undeclared exception!
      try { 
        task_14115_0.checkSet((Set<Object>) null, "2v&imA)");
      } catch(NullPointerException e) {
         //
         // Set or element cannot be null
         //
         verifyException("com.example.task_evaluated.task_14115", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      task_14115 task_14115_0 = new task_14115();
      // Undeclared exception!
      try { 
        task_14115_0.checkSet(linkedHashSet0, linkedHashSet0);
      } catch(ClassCastException e) {
         //
         // Type of element is incompatible with this set
         //
         verifyException("com.example.task_evaluated.task_14115", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14115 task_14115_0 = new task_14115();
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        task_14115_0.checkSet(linkedHashSet0, (Object) null);
      } catch(NullPointerException e) {
         //
         // Set or element cannot be null
         //
         verifyException("com.example.task_evaluated.task_14115", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      boolean boolean0 = linkedHashSet0.add(linkedHashSet0);
      task_14115 task_14115_0 = new task_14115();
      task_14115_0.checkSet(linkedHashSet0, linkedHashSet0);
  }
}
