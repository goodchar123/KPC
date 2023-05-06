/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 18:26:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1524;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1524_ESTest extends task_1524_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1524 task_1524_0 = new task_1524();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[1];
      Object object0 = hashMap0.put("/60'}*eA", (Object) null);
      stringArray0[0] = "/60'}*eA";
      Object[] objectArray0 = task_1524.getValues(hashMap0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      Object object0 = hashMap0.putIfAbsent("", "");
      // Undeclared exception!
      try { 
        task_1524.getValues(hashMap0, stringArray0);
      } catch(ClassCastException e) {
         //
         // Inappropriate key type for this map
         //
         verifyException("com.example.task_evaluated.task_1524", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Inappropriate key type for this map";
      Object object0 = new Object();
      Object object1 = hashMap0.put("Inappropriate key type for this map", object0);
      // Undeclared exception!
      try { 
        task_1524.getValues(hashMap0, stringArray0);
      } catch(NullPointerException e) {
         //
         // Key is null or not present in map
         //
         verifyException("com.example.task_evaluated.task_1524", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[6];
      // Undeclared exception!
      try { 
        task_1524.getValues((Map<String, Object>) null, stringArray0);
      } catch(NullPointerException e) {
      }
  }
}
