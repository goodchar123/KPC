/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:36:56 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9082;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9082_ESTest extends task_9082_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9082 task_9082_0 = new task_9082();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      task_9082.removeMapping((Map<Object, Object>) hashMap1, (Object) hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Integer, Integer> hashMap0 = new HashMap<Integer, Integer>();
      Integer integer0 = new Integer(0);
      Integer integer1 = hashMap0.put(integer0, integer0);
      task_9082.removeMapping((Map<Integer, Integer>) hashMap0, integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_9082.removeMapping((Map<String, Object>) null, "");
      } catch(NullPointerException e) {
      }
  }
}
