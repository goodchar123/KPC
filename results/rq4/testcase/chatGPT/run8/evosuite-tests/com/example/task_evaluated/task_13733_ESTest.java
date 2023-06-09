/*
 * This file was automatically generated by EvoSuite
 * Fri May 05 10:46:10 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_13733;
import java.util.HashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_13733_ESTest extends task_13733_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_13733 task_13733_0 = new task_13733();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      task_13733.removeMapping((Map<Object, Object>) hashMap0, (Object) "W*jn.uW&");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = hashMap0.put((Object) null, "W*jn.uW&");
      task_13733.removeMapping((Map<Object, Object>) hashMap0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        task_13733.removeMapping((Map<Object, String>) null, (Object) "");
      } catch(NullPointerException e) {
      }
  }
}
