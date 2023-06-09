/*
 * This file was automatically generated by EvoSuite
 * Wed May 03 03:04:29 GMT 2023
 */

package com.example.task_evaluated;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.example.task_evaluated.task_15048;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class task_15048_ESTest extends task_15048_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      task_15048 task_15048_0 = new task_15048();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = task_15048.getValue((Dictionary) null, (Object) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Hashtable<String, Integer> hashtable0 = new Hashtable<String, Integer>(0);
      Object object0 = task_15048.getValue(hashtable0, (Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Hashtable<String, Object> hashtable0 = new Hashtable<String, Object>();
      Set<Map.Entry<String, Object>> set0 = hashtable0.entrySet();
      Hashtable<Object, Object> hashtable1 = new Hashtable<Object, Object>(hashtable0);
      Object object0 = hashtable0.put("", set0);
      // Undeclared exception!
      try { 
        task_15048.getValue(hashtable1, hashtable0);
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
