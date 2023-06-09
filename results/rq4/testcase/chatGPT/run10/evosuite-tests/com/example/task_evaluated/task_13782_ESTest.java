/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:14:51 GMT 2023
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
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = hashMap0.put(task_13782_0, task_13782_0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<Object, Object>) hashMap0, (Object) integer0, true);
      } catch(ClassCastException e) {
         //
         // com.example.task_evaluated.task_13782 cannot be cast to java.lang.Comparable
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Map<String, Object> map0 = task_13782.subMapByKeys((Map<String, Object>) hashMap0, "f)YrGF", false);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13782.subMapByKeys((Map<Object, String>) null, (Object) null, true);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_13782", e);
      }
  }
}
