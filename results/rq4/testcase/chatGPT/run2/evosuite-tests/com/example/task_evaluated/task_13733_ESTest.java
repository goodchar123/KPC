/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 20:00:43 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13733;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13733_ESTest extends task_13733_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13733 task_13733_0 = new task_13733();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      task_13733.removeMapping((Map<Object, Integer>) hashMap0, (Object) hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Integer integer0 = new Integer((-521));
      HashMap<Integer, Object> hashMap1 = new HashMap<Integer, Object>();
      Object object0 = hashMap1.put(integer0, hashMap0);
      task_13733.removeMapping((Map<Integer, Object>) hashMap1, integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13733.removeMapping((Map<Object, Integer>) null, (Object) null);
      } catch(NullPointerException e) {
      }
  }
}