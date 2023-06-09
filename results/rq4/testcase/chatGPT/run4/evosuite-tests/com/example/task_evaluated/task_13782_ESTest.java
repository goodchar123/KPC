/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 08:57:35 GMT 2023
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
      HashMap<Integer, HashMap<String, Object>> hashMap0 = new HashMap<Integer, HashMap<String, Object>>();
      Integer integer0 = new Integer(2507);
      Map<Integer, HashMap<String, Object>> map0 = task_13782.subMapByKeys((Map<Integer, HashMap<String, Object>>) hashMap0, integer0, false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<String, Object>) null, "com.example.task_evaluated.task_13782", true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<HashMap<Object, Integer>, String> hashMap0 = new HashMap<HashMap<Object, Integer>, String>(1);
      HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
      HashMap<Object, Integer> hashMap2 = new HashMap<Object, Integer>(hashMap1);
      String string0 = hashMap0.put(hashMap2, "");
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<HashMap<Object, Integer>, String>) hashMap0, hashMap2, true);
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.Comparable
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }
}
