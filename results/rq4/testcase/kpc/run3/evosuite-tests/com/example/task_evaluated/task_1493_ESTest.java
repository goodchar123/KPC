/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 07:32:44 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1493;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_1493_ESTest extends task_1493_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_1493 task_1493_0 = new task_1493();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      Object object0 = new Object();
      Object object1 = hashMap0.put("", object0);
      stringArray0[3] = "";
      stringArray0[4] = "";
      Object[] objectArray0 = task_1493.getValues(hashMap0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[4];
      Object object0 = hashMap0.put("Inappropriate key type for this map", (Object) null);
      stringArray0[0] = "Inappropriate key type for this map";
      // Undeclared exception!
      try { 
        task_1493.getValues(hashMap0, stringArray0);
      } catch(NullPointerException e) {
         //
         // Key is null or not present in map
         //
         verifyException("com.example.task_evaluated.task_1493", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[4];
      Object object0 = hashMap0.put("Inappropriate key type for this map", (Object) null);
      stringArray0[0] = "Inappropriate key type for this map";
      stringArray0[1] = "Inappropriate key type for this map";
      stringArray0[2] = "";
      Object object1 = hashMap0.put("", "");
      // Undeclared exception!
      try { 
        task_1493.getValues(hashMap0, stringArray0);
      } catch(ClassCastException e) {
         //
         // Inappropriate key type for this map
         //
         verifyException("com.example.task_evaluated.task_1493", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_1493.getValues((Map<String, Object>) null, (String[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1493", e);
      }
  }
}