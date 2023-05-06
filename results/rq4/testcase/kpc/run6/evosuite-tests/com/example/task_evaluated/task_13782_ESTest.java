/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:32:02 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13782;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13782_ESTest extends task_13782_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13782 task_13782_0 = new task_13782();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, HashMap<Object, String>> hashMap0 = new HashMap<String, HashMap<Object, String>>();
      HashMap<Object, String> hashMap1 = new HashMap<Object, String>();
      String string0 = hashMap1.put(hashMap0, "A}=bBA_uIMF");
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<Object, String>) hashMap1, (Object) hashMap1, false);
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.Comparable
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<Object, Object>) null, (Object) hashMap0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }
}
