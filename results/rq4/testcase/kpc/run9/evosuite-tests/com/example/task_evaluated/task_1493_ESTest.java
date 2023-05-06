/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 15:10:34 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_1493;
import java.util.HashMap;
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
      String[] stringArray0 = new String[0];
      Object[] objectArray0 = task_1493.getValues(hashMap0, stringArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[1];
      Object object0 = hashMap0.put("XZF[7Q9", "MenVVP3ZfYBJ");
      stringArray0[0] = "XZF[7Q9";
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
  public void test3()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      String[] stringArray0 = new String[3];
      Object object0 = hashMap0.put("", (Object) null);
      stringArray0[0] = "";
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
  public void test4()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object object0 = new Object();
      Object object1 = hashMap0.put("", object0);
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
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
  public void test5()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      // Undeclared exception!
      try { 
        task_1493.getValues(hashMap0, (String[]) null);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_1493", e);
      }
  }
}
