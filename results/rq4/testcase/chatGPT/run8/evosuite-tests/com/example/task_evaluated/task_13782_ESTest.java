/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:04:03 GMT 2023
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
      String string0 = "/\\unQ\\T48PPN";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Map<String, Integer> map0 = task_13782.subMapByKeys((Map<String, Integer>) hashMap0, string0, true);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<HashMap<String, String>, Object> hashMap0 = new HashMap<HashMap<String, String>, Object>();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      Object object0 = new Object();
      Object object1 = hashMap0.put(hashMap1, object0);
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<HashMap<String, String>, Object>) hashMap0, hashMap1, false);
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.Comparable
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<HashMap<String, Integer>, String>) null, hashMap0, false);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }
}
