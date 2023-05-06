/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 09:29:18 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_18164;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
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
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      task_18164.removeMapping((Map<Object, Integer>) hashMap0, (Object) hashMap0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18164.removeMapping((Map<Object, String>) null, (Object) null);
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Set<Object> set0 = hashMap0.keySet();
      Object object0 = new Object();
      Object object1 = hashMap0.put(set0, object0);
      // Undeclared exception!
      try { 
        task_18164.removeMapping((Map<Object, Object>) hashMap0, (Object) set0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}