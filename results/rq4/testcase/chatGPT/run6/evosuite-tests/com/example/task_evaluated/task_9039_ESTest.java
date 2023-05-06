/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 04:43:57 GMT 2023
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
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = hashMap0.put(integer0, integer0);
      boolean boolean0 = task_9039.containsValue(hashMap0, hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer(0);
      Object object0 = hashMap0.put(integer0, integer0);
      Object object1 = hashMap0.put(integer0, object0);
      boolean boolean0 = task_9039.containsValue(hashMap0, object0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9039.containsValue((Map<?, ?>) null, (Object) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9039", e);
      }
  }
}
