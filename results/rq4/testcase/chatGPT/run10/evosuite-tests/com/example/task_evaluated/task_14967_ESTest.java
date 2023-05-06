/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 17:47:25 GMT 2023
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
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = hashMap0.put((Object) null, integer0);
      Object object0 = task_14967_0.getKey((Map<Object, Integer>) hashMap0, integer0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14967 task_14967_0 = new task_14967();
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = hashMap0.put((Object) null, integer0);
      Object object0 = task_14967_0.getKey((Map<Object, Integer>) hashMap0, integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14967 task_14967_0 = new task_14967();
      // Undeclared exception!
      try { 
        task_14967_0.getKey((Map<String, String>) null, (String) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14967", e);
      }
  }
}