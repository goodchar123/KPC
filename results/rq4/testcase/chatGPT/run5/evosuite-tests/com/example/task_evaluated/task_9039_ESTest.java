/*
 * This file was automatically generated by EvoSuite
 * Thu May 04 19:23:19 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_9039;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_9039_ESTest extends task_9039_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_9039 task_9039_0 = new task_9039();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Object object0 = hashMap0.put((Integer) null, task_9039_0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(hashMap0);
      boolean boolean0 = task_9039.containsValue(hashMap1, task_9039_0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      task_9039 task_9039_0 = new task_9039();
      HashMap<Integer, Object> hashMap0 = new HashMap<Integer, Object>();
      Object object0 = hashMap0.put((Integer) null, task_9039_0);
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>(hashMap0);
      BiFunction<Object, Object, String> biFunction0 = (BiFunction<Object, Object, String>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(biFunction0).apply(any() , any());
      hashMap1.replaceAll(biFunction0);
      boolean boolean0 = task_9039.containsValue(hashMap1, task_9039_0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        task_9039.containsValue((Map<?, ?>) null, object0);
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.example.task_evaluated.task_9039", e);
      }
  }
}
