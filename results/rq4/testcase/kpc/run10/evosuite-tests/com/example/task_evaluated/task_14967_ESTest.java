/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 18:32:07 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_14967;
import java.util.AbstractMap;
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
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      String string0 = hashMap0.put(task_14967_0, "");
      Object object0 = task_14967_0.getKey((Map<Object, String>) hashMap0, "");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_14967 task_14967_0 = new task_14967();
      HashMap<Object, String> hashMap0 = new HashMap<Object, String>();
      String string0 = hashMap0.put(task_14967_0, "");
      AbstractMap.SimpleEntry<Object, String> abstractMap_SimpleEntry0 = new AbstractMap.SimpleEntry<Object, String>(hashMap0, "");
      String string1 = task_14967_0.getKey((Map<String, AbstractMap.SimpleEntry<Object, AbstractMap.SimpleImmutableEntry>>) hashMap0, (AbstractMap.SimpleEntry<Object, AbstractMap.SimpleImmutableEntry>) abstractMap_SimpleEntry0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      task_14967 task_14967_0 = new task_14967();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        task_14967_0.getKey((Map<Object, Object>) null, (Object) hashMap0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_14967", e);
      }
  }
}
