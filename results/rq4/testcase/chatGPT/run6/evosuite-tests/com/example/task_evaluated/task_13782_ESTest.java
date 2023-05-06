/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 05:11:36 GMT 2023
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
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Object object0 = new Object();
      Integer integer0 = new Integer(323);
      Integer integer1 = hashMap0.put(object0, integer0);
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<Object, Integer>) hashMap0, object0, true);
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Comparable
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, HashMap<Integer, Object>> hashMap0 = new HashMap<String, HashMap<Integer, Object>>();
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      HashMap<Integer, Object> hashMap2 = hashMap0.put("H3o=#~vt^NO09H {:", hashMap1);
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<String, HashMap<Integer, Object>>) hashMap0, (String) null, false);
      } catch(NullPointerException e) {
      }
  }
}