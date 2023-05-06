/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 16:13:57 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18157;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18157_ESTest extends task_18157_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18157 task_18157_0 = new task_18157();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      task_18157.removeMapping((Map<Object, String>) hashMap0, (Object) hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        task_18157.removeMapping((Map<Object, Object>) hashMap0, (Object) null);
      } catch(NullPointerException e) {
         //
         // This map does not permit null keys.
         //
         verifyException("com.example.task_evaluated.task_18157", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = hashMap0.put((Object) null, "~NIC'PRJv>9Dzk4o_*f");
      task_18157.removeMapping((Map<Object, Object>) hashMap0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(1890);
      // Undeclared exception!
      try { 
        task_18157.removeMapping((Map<Integer, Object>) null, integer0);
      } catch(NullPointerException e) {
      }
  }
}