/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:00:04 GMT 2023
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
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      task_18157.removeMapping((Map<String, Object>) hashMap0, "");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      String string0 = hashMap0.put("", "EFE}#}w06.");
      task_18157.removeMapping((Map<String, String>) hashMap0, "");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_18157.removeMapping((Map<String, String>) null, "");
      } catch(NullPointerException e) {
      }
  }
}