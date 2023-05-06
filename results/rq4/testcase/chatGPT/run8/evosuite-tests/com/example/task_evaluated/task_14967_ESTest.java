/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:37:49 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14967;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_14967_ESTest extends task_14967_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_14967 task_14967_0 = new task_14967();
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer((-3308));
      Integer integer1 = hashMap1.put(hashMap0, integer0);
      Object object0 = task_14967_0.getKey((Map<Object, Integer>) hashMap1, integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14967 task_14967_0 = new task_14967();
      Integer integer0 = new Integer((-3308));
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = hashMap0.put("Isqgb#K7Hia#WQ", integer0);
      String string0 = task_14967_0.getKey((Map<String, Object>) hashMap0, (Object) integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14967 task_14967_0 = new task_14967();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = hashMap0.put((String) null, (Integer) null);
      // Undeclared exception!
      try { 
        task_14967_0.getKey((Map<String, Integer>) hashMap0, integer0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14967", e);
      }
  }
}
