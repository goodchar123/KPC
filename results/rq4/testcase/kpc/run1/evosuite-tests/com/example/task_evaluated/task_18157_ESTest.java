/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 15:47:27 GMT 2023
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
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Integer integer0 = new Integer((-1990));
      task_18157.removeMapping((Map<Integer, Object>) hashMap0, integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18157.removeMapping((Map<String, Integer>) null, (String) null);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        task_18157.removeMapping((Map<String, Object>) hashMap0, (String) null);
      } catch(NullPointerException e) {
         //
         // This map does not permit null keys.
         //
         verifyException("com.example.task_evaluated.task_18157", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer(2419);
      Integer integer1 = hashMap0.put((String) null, integer0);
      task_18157.removeMapping((Map<String, Integer>) hashMap0, (String) null);
  }
}