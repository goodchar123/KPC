/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 15:04:51 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9039;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9039_ESTest extends task_9039_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9039 task_9039_0 = new task_9039();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      String string0 = hashMap0.put(task_9039_0, "e");
      boolean boolean0 = task_9039.containsValue(hashMap0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      boolean boolean0 = task_9039.containsValue(hashMap0, object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_9039 task_9039_0 = new task_9039();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      String string0 = hashMap0.put(task_9039_0, "e");
      boolean boolean0 = task_9039.containsValue(hashMap0, "e");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      task_9039 task_9039_0 = new task_9039();
      // Undeclared exception!
      try { 
        task_9039.containsValue((Map<?, ?>) null, task_9039_0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9039", e);
      }
  }
}