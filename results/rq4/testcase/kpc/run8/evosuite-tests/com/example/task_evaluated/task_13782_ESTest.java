/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:26:36 GMT 2023
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
      HashMap<HashMap<String, Object>, Integer> hashMap0 = new HashMap<HashMap<String, Object>, Integer>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Integer integer0 = new Integer(4334);
      Integer integer1 = hashMap0.put(hashMap1, integer0);
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<HashMap<String, Object>, Integer>) hashMap0, hashMap1, false);
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.Comparable
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer((-1098));
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<Integer, String>) null, integer0, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }
}
