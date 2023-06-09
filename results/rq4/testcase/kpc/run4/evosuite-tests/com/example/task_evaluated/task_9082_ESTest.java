/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:04:25 GMT 2023
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
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>(hashMap0);
      // Undeclared exception!
      try { 
        task_9082.removeMapping((Map<Object, Integer>) hashMap1, (Object) hashMap0);
      } catch(ClassCastException e) {
         //
         // Key is of an inappropriate type for this map
         //
         verifyException("com.example.task_evaluated.task_9082", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      // Undeclared exception!
      try { 
        task_9082.removeMapping((Map<Object, Object>) hashMap0, (Object) null);
      } catch(NullPointerException e) {
         //
         // Specified key is null and this map does not permit null keys
         //
         verifyException("com.example.task_evaluated.task_9082", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      Object object1 = hashMap0.put((String) null, object0);
      task_9082.removeMapping((Map<String, Object>) hashMap0, (String) null);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<Object, Integer> hashMap1 = new HashMap<Object, Integer>(hashMap0);
      Integer integer0 = new Integer((-4162));
      Integer integer1 = hashMap1.put(hashMap0, integer0);
      task_9082.removeMapping((Map<Object, Integer>) hashMap1, (Object) hashMap0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_9082.removeMapping((Map<Object, String>) null, object0);
      } catch(NullPointerException e) {
      }
  }
}
