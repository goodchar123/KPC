/*
 * This file was automatically generated by EvoSuite
 * Tue May 02 21:44:18 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18164;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_18164_ESTest extends task_18164_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_18164 task_18164_0 = new task_18164();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      Integer integer0 = new Integer(0);
      task_18164.removeMapping((Map<Object, String>) hashMap0, (Object) integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        task_18164.removeMapping((Map<Object, Object>) hashMap0, (Object) null);
      } catch(NullPointerException e) {
         //
         // This map does not permit null keys.
         //
         verifyException("com.example.task_evaluated.task_18164", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>(0);
      Integer integer0 = new Integer(1974);
      Integer integer1 = hashMap0.put((String) null, integer0);
      task_18164.removeMapping((Map<String, Integer>) hashMap0, (String) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18164.removeMapping((Map<Object, String>) null, (Object) null);
      } catch(NullPointerException e) {
      }
  }
}
